package com.example.testfood_app.data.models.newsModel

data class NewsResponseData(
    val status:String,
    val totalResults:Int ,
    val articles: List<Articles>
)
