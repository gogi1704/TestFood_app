package com.example.testfood_app.ui.adapter.discountsAdapter

import androidx.recyclerview.widget.DiffUtil
import com.example.testfood_app.data.models.Discount

class DiscountDiffUtil:DiffUtil.ItemCallback<Discount>() {
    override fun areItemsTheSame(oldItem: Discount, newItem: Discount): Boolean {
        return   oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Discount, newItem: Discount): Boolean {
      return  oldItem.imageUrl == newItem.imageUrl
    }
}