package com.example.testfood_app.data.db.di

import android.content.Context
import androidx.room.Room
import com.example.testfood_app.data.db.AppDb
import com.example.testfood_app.data.db.dao.NewsSourceDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)

class DbModule {

    companion object {
        const val DATA_BASE_NAME = "APP_DATA_BASE"
    }

    @Singleton
    @Provides
    fun provideDb(@ApplicationContext context: Context): AppDb =
        Room.databaseBuilder(context, AppDb::class.java, DATA_BASE_NAME)
            .fallbackToDestructiveMigration()
            .build()


    @Singleton
    @Provides
    fun providesNewsSourceDao(appDb: AppDb): NewsSourceDao = appDb.newsSourceDao()
}