package com.example.testfood_app.data.repository.di

import com.example.testfood_app.data.repository.NewsRepository
import com.example.testfood_app.data.repository.NewsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
interface NewsRepositoryModule {


    @Singleton
    @Binds
    fun bindNewsRepository(impl: NewsRepositoryImpl): NewsRepository
}