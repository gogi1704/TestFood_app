package com.example.testfood_app.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testfood_app.data.db.dao.NewsSourceDao
import com.example.testfood_app.data.db.entities.NewsSourceEntity

@Database(entities = [ NewsSourceEntity::class], version = 1)
abstract class AppDb : RoomDatabase() {
    abstract fun newsSourceDao(): NewsSourceDao
}