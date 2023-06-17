package com.example.testfood_app.api.module

import com.amar.library.BuildConfig
import com.example.testfood_app.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ApiModule {

    companion object{
        const val NEWS_API_KEY = "484b05f2fc4f4f158f18be170b7796ae"
        const val NEWS_BASE_URL = "https://newsapi.org/v2/top-headlines/"
    }

    @Singleton
    @Provides
    fun providesLogging(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        if (BuildConfig.DEBUG) {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(logging: HttpLoggingInterceptor): OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(30 , TimeUnit.SECONDS)
        .addInterceptor(logging)
        .build()

    @Singleton
    @Provides
    fun provideRetrofit(client: OkHttpClient): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(NEWS_BASE_URL)
        .client(client)
        .build()

    @Singleton
    @Provides
    fun provideWeatherApiService(retrofit: Retrofit): ApiService = retrofit.create()



}