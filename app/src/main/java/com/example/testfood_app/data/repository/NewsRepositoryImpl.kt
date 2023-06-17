package com.example.testfood_app.data.repository

import com.example.testfood_app.api.ApiService
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val apiService: ApiService) : NewsRepository {
    override suspend fun getSources(country: String, apiKey: String) {
        apiService.getNewsSources(country, apiKey)
    }
    override suspend fun getNews(source: String, apiKey: String) {
        apiService.getNews(source, apiKey)
    }
}