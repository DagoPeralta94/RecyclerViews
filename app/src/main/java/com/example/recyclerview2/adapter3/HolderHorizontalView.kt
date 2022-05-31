package com.example.recyclerview2.adapter3

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview2.ModelGridView
import com.example.recyclerview2.databinding.ItemGridBinding

class HolderHorizontalView(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemGridBinding.bind(view)

    fun render(modelGridView: ModelGridView){
        Glide.with(binding.photo2.context).load(modelGridView.urlphoto).into(binding.photo2)
    }
}