package com.example.kfcmain.adapters.items.viewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.adapters.items.Category
import com.example.kfcmain.databinding.HeaderItemBinding

class HeaderHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = HeaderItemBinding.bind(view)

    fun bind(item: Category) = with(binding){
        tvHeader.text = item.name
    }
}