package com.example.testfood_app.data.repository

import com.example.testfood_app.api.ApiService
import com.example.testfood_app.api.module.ApiModule.Companion.NEWS_API_KEY
import com.example.testfood_app.data.db.dao.NewsSourceDao
import com.example.testfood_app.data.models.newsModel.Articles
import com.example.testfood_app.data.models.newsSourceModel.toEntity
import com.example.testfood_app.data.models.newsSourceModel.toModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import java.lang.Exception
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val dao: NewsSourceDao
) : NewsRepository {


    val newsDataFlow = dao.getAll()
        .map { it.toModel() }
        .flowOn(Dispatchers.Default)


    override suspend fun getSources() {

        val response = apiService.getNewsSources("ru", NEWS_API_KEY)
        if (response.isSuccessful) {
            dao.insertNews(response.body()?.sources?.toEntity() ?: throw Exception())
        } else throw Exception()
    }

    override suspend fun getNews(source: String): List<Articles> {
        val response = apiService.getNews(source, NEWS_API_KEY)
        if (response.isSuccessful) {
            return response.body()?.articles ?: throw Exception()
        } else throw Exception()
    }


    suspend fun check(id: String) {
        dao.check(id)
    }
}