package com.example.testfood_app.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.testfood_app.data.models.newsModel.Articles
import com.example.testfood_app.data.repository.NewsRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    application: Application,
    private val repository: NewsRepositoryImpl
) : AndroidViewModel(application) {

    var newsData = mutableListOf<Articles>()
        set(value) {
            field = value
            newsLiveData.value = value
        }

    val newsLiveData = MutableLiveData(newsData)

    val newsSourcesData = repository.newsDataFlow.asLiveData(Dispatchers.Default)
    var usedSourcesIds = newsSourcesData.value?.filter { it.isUsed }?.map { it.id }?.toMutableList()

    fun getSources() {
        viewModelScope.launch {
            repository.getSources()
        }
    }


    fun getNews() {
        viewModelScope.launch {
            val newList = mutableListOf<Articles>()
            if (!usedSourcesIds.isNullOrEmpty()) {
                for (i in usedSourcesIds!!) {
                    newList.addAll(repository.getNews(i))
                }
            }
            newsData = newList
        }

    }


    fun check(id: String) {
        if (usedSourcesIds?.contains(id) == true) {
            usedSourcesIds!!.remove(id)
        } else {
            usedSourcesIds?.add(id)
        }
        viewModelScope.launch {
            repository.check(id)
        }
    }


    init {
        getSources()
    }


}