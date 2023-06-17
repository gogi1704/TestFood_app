package com.example.testfood_app.data.repository

interface NewsRepository {

    suspend fun getSources(country:String , apiKey:String)
    suspend fun getNews(source:String , apiKey:String)
}