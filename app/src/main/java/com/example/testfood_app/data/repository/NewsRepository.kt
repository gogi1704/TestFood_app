package com.example.testfood_app.data.repository

import com.example.testfood_app.data.models.newsModel.Articles

interface NewsRepository {

    suspend fun getSources()
    suspend fun getNews(source:String):List<Articles>
}