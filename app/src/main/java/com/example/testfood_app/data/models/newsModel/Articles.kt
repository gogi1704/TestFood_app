package com.example.testfood_app.data.models.newsModel

data class Articles(
    val author:String ,
    val title:String,
    val description:String?,
    val url:String,
    val urlToImage:String?,
    val publishedAt:String,
    val content:String
)
