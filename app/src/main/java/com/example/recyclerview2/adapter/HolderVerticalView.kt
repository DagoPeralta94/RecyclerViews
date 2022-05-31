package com.example.recyclerview2.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview2.ModelVerticalView
import com.example.recyclerview2.R
import com.example.recyclerview2.databinding.ItemVerticalBinding

class HolderVerticalView(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemVerticalBinding.bind(view)

    fun render(modelVerticalView: ModelVerticalView){

        binding.txTitle.text = modelVerticalView.title
        binding.txDescription.text = modelVerticalView.description
        Glide.with(binding.ivPhoto.context).load(modelVerticalView.url).into(binding.ivPhoto)

    }
}