package com.example.testfood_app.data.repository

import com.example.testfood_app.data.models.NewsSourceModel

interface NewsRepository {

    suspend fun getSources()
    suspend fun getNews(source:String):List<NewsSourceModel>
}