package com.example.kfcmain.adapters.items.viewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.adapters.items.Product
import com.example.kfcmain.databinding.ProductItemBinding

class ProductHolder(view:View): RecyclerView.ViewHolder(view) {
    val binding = ProductItemBinding.bind(view)
    fun bind(item:Product)= with(binding){
        imImageOfProduct.setImageResource(item.image)
        tvDescriptionProd.text = item.name
        tvPrice.text = "${item.price} Р"
    }
}