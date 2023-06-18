package com.example.testfood_app.data.repository

import com.example.testfood_app.api.ApiService
import com.example.testfood_app.api.module.ApiModule.Companion.NEWS_API_KEY
import com.example.testfood_app.data.models.NewsSourceModel
import java.lang.Exception
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val apiService: ApiService) : NewsRepository {
    override suspend fun getSources(): List<NewsSourceModel> {

        val response = apiService.getNewsSources("ru", NEWS_API_KEY)
        if (response.isSuccessful) {
            return response.body()?.sources ?: throw Exception()
        } else throw Exception()
    }

    override suspend fun getNews(source: String): List<NewsSourceModel> {
        val response = apiService.getNews(source, NEWS_API_KEY)

        if (response.isSuccessful) {
            return response.body() ?: throw Exception()
        } else throw Exception()
    }
}