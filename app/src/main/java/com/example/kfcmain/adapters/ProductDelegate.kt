package com.example.kfcmain.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.R
import com.example.kfcmain.adapters.items.ListItem
import com.example.kfcmain.adapters.items.Product
import com.example.kfcmain.adapters.items.viewHolders.ProductHolder

class ProductDelegate(context: Context): Delegate {
    override fun forItem(listItem: ListItem): Boolean = listItem is Product

    override fun getViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ProductHolder(view)
    }

    override fun bindViewHolder(viewHolder: RecyclerView.ViewHolder, item: ListItem) {
        (viewHolder as ProductHolder).let { productHolder ->
            val product = item as Product
            viewHolder.bind(product)
        }
    }

}