package com.example.testfood_app.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.testfood_app.R

fun ImageView.getImage(url:String){
    Glide.with(this)
        .load(url)
        .placeholder(R.drawable.baseline_error_outline_24)
        .timeout(10_000)
        .into(this)
}