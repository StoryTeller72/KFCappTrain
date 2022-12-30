package com.example.kfcmain.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.adapters.items.ListItem

interface Delegate {
    fun forItem(listItem: ListItem): Boolean
    fun getViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun bindViewHolder(viewHolder: RecyclerView.ViewHolder, item: ListItem)
}