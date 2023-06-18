package com.example.testfood_app.api

import com.example.testfood_app.data.models.newsModel.NewsResponseData
import com.example.testfood_app.data.models.newsSourceModel.NewsSourceResponseData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {
    @GET(" ")
    suspend fun getNews(
      @Query("sources") sources: String,
      @Query("apiKey") apiKey: String
    ): Response<NewsResponseData>

    @GET("sources?")
    suspend fun getNewsSources(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String
    ): Response<NewsSourceResponseData>

}