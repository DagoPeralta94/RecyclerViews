package com.example.recyclerview2.adapter3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview2.ModelGridView
import com.example.recyclerview2.R
import com.example.recyclerview2.adapter.HolderVerticalView

class AdapterHorizontalView(val horizontalList: List<ModelGridView>): RecyclerView.Adapter<HolderHorizontalView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderHorizontalView {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HolderHorizontalView(layoutInflater.inflate(R.layout.item_grid, parent, false))
    }

    override fun onBindViewHolder(holder: HolderHorizontalView, position: Int) {
        val item = horizontalList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = horizontalList.size
}