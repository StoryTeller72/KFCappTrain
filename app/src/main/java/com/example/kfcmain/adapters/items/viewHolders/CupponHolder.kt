package com.example.kfcmain.adapters.items.viewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.adapters.items.CupponItem
import com.example.kfcmain.databinding.CuponsFragmentMenuItemBinding

class CupponHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = CuponsFragmentMenuItemBinding.bind(view)

    fun bind(item: CupponItem) = with(binding){
        ivCuponmenuItem.setImageResource(item.img)
        btnCuponfragmentAddProduct.text = "${item.price} Р"
        numberofCupon.text = item.number.toString()
    }
}