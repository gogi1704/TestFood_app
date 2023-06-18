package com.example.testfood_app.ui.adapter.newsSourceAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testfood_app.data.models.NewsSourceModel
import com.example.testfood_app.databinding.ItemSourceLayoutBinding

interface NewsSourceOnClickListener {
    fun clickSource(id: String)
}

class NewsSourceAdapter(private val listener: NewsSourceOnClickListener) :
    ListAdapter<NewsSourceModel, NewsSourceAdapter.NewsSourceViewHolder>(NewsSourceDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsSourceViewHolder {
        val binding =
            ItemSourceLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsSourceViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: NewsSourceViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    class NewsSourceViewHolder(
        private val binding: ItemSourceLayoutBinding,
        private val listener: NewsSourceOnClickListener
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: NewsSourceModel) {
            with(binding) {
                buttonSource.text = item.name
                buttonSource.isChecked = item.isUsed
                buttonSource.setOnClickListener {
                    listener.clickSource(item.id)
                }
            }
        }

    }
}