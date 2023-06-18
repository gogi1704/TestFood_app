package com.example.testfood_app.api

import com.example.testfood_app.data.models.NewsSourceModel
import com.example.testfood_app.data.models.NewsSourceResponseData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET
    suspend fun getNews(
        @Query("sources") source: String,
        @Query("apiKey") apiKey: String
    ): Response<List<NewsSourceModel>>

//https://newsapi.org/v2/top-headlines/sources?country=ru&apiKey=484b05f2fc4f4f158f18be170b7796ae
    @GET("sources?")
    suspend fun getNewsSources(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String
    ): Response<NewsSourceResponseData>

}