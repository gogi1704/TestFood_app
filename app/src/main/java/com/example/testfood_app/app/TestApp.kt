package com.example.testfood_app.app

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TestApp : Application() {
    init {
        AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
    }

}