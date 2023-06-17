package com.example.testfood_app.ui.adapter.newsSourceAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testfood_app.data.NewsSourceModel
import com.example.testfood_app.databinding.ItemSourceLayoutBinding

class NewsSourceAdapter :
    ListAdapter<NewsSourceModel, NewsSourceAdapter.NewsSourceViewHolder>(NewsSourceDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsSourceViewHolder {
       val binding = ItemSourceLayoutBinding.inflate(LayoutInflater.from(parent.context) , parent , false )
        return NewsSourceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsSourceViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    class NewsSourceViewHolder(private val binding: ItemSourceLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bind(item:NewsSourceModel){
                with(binding){
                    buttonSource.text = item.name
                }
            }

    }
}