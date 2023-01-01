package com.example.kfcmain.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.R
import com.example.kfcmain.adapters.items.Category
import com.example.kfcmain.adapters.items.ListItem
import com.example.kfcmain.adapters.items.viewHolders.HeaderHolder

class HeaderDelegate(): Delegate {
    override fun forItem(listItem: ListItem): Boolean  = listItem is Category

    override fun getViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.header_item, parent, false)
        return HeaderHolder(view)
    }

    override fun bindViewHolder(viewHolder: RecyclerView.ViewHolder, item: ListItem) {
        (viewHolder as HeaderHolder).let { headerHolder ->
            val header = item as Category
            viewHolder.bind(header)
        }
    }

}