package com.example.recyclerview2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview2.ModelVerticalView
import com.example.recyclerview2.R

class AdapterVerticalView(private val verticalList: List<ModelVerticalView>) :
    RecyclerView.Adapter<HolderVerticalView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderVerticalView {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HolderVerticalView(layoutInflater.inflate(R.layout.item_vertical, parent, false))
    }

    override fun onBindViewHolder(holder: HolderVerticalView, position: Int) {
        val item = verticalList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = verticalList.size

}