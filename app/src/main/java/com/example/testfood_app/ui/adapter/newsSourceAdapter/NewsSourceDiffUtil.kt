package com.example.testfood_app.ui.adapter.newsSourceAdapter

import androidx.recyclerview.widget.DiffUtil
import com.example.testfood_app.data.models.NewsSourceModel

class NewsSourceDiffUtil:DiffUtil.ItemCallback<NewsSourceModel>() {
    override fun areItemsTheSame(oldItem: NewsSourceModel, newItem: NewsSourceModel): Boolean {
      return  oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: NewsSourceModel, newItem: NewsSourceModel): Boolean {
      return oldItem.name == newItem.name
    }
}