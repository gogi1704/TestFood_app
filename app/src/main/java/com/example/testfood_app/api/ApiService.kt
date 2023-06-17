package com.example.testfood_app.api

import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET
    suspend fun getNews(
        @Query("sources") source: String,
        @Query("apiKey") apiKey: String
    ): Response<JsonObject>


    @GET
    suspend fun getNewsSources(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String
    ): Response<JsonObject>

}