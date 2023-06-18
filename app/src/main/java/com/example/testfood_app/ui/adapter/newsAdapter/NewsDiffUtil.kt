package com.example.testfood_app.ui.adapter.newsAdapter

import androidx.recyclerview.widget.DiffUtil
import com.example.testfood_app.data.models.newsModel.Articles

class NewsDiffUtil : DiffUtil.ItemCallback<Articles>() {
    override fun areItemsTheSame(oldItem: Articles, newItem: Articles): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: Articles, newItem: Articles): Boolean {
        return oldItem == newItem
    }
}