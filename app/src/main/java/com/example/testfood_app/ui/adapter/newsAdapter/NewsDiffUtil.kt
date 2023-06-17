package com.example.testfood_app.ui.adapter.newsAdapter

import androidx.recyclerview.widget.DiffUtil
import com.example.testfood_app.data.NewsModel

class NewsDiffUtil : DiffUtil.ItemCallback<NewsModel>() {
    override fun areItemsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
        return oldItem == newItem
    }
}