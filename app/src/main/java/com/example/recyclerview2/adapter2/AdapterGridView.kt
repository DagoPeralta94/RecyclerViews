package com.example.recyclerview2.adapter2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview2.ModelGridView
import com.example.recyclerview2.R

class AdapterGridView(val gridList: List<ModelGridView>) : RecyclerView.Adapter<HolderGridView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderGridView {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HolderGridView(layoutInflater.inflate(R.layout.item_grid, parent, false))
    }

    override fun onBindViewHolder(holder: HolderGridView, position: Int) {
        val item = gridList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = gridList.size
}