package com.example.testfood_app.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.testfood_app.data.models.NewsSourceModel
import com.example.testfood_app.data.repository.NewsRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    application: Application,
    private val repository: NewsRepositoryImpl
) : AndroidViewModel(application) {
    private var list = listOf<NewsSourceModel>()
        set(value) {
            field = value
            println(value)
        }
    fun getSources() {
        viewModelScope.launch {
            list = repository.getSources()
        }
    }

    fun getNews() {}


    init {
        getSources()
    }


}