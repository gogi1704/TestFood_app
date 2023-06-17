package com.example.testfood_app.ui.adapter.discountsAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testfood_app.R
import com.example.testfood_app.data.models.Discount
import com.example.testfood_app.databinding.ItemRecyclerDiscountsLayoutBinding

class DiscountsAdapter :
    ListAdapter<Discount, DiscountsAdapter.DiscountViewHolder>(DiscountDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountViewHolder {
        val binding = ItemRecyclerDiscountsLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return DiscountViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DiscountViewHolder, position: Int) {
        holder.bind()
    }


    class DiscountViewHolder(private val binding: ItemRecyclerDiscountsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            binding.image.setImageResource(R.drawable.discoun_photo)
        }

    }

}

