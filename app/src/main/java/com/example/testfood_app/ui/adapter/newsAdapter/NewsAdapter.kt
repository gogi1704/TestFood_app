package com.example.testfood_app.ui.adapter.newsAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testfood_app.data.models.newsModel.Articles
import com.example.testfood_app.databinding.ItemNewsLayoutBinding
import com.example.testfood_app.extensions.getImage

class NewsAdapter : ListAdapter<Articles, NewsAdapter.MyViewHolder>(NewsDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding =
            ItemNewsLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    class MyViewHolder(private val binding: ItemNewsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Articles) {
            with(binding) {
                textName.text = item.author
                textContent.text = item.title
                if (!item.urlToImage.isNullOrBlank()) {
                    image.getImage(url = item.urlToImage)
                }

            }
        }
    }
}