package com.example.kfcmain.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.R
import com.example.kfcmain.adapters.items.CupponItem
import com.example.kfcmain.adapters.items.viewHolders.CupponHolder

class CupponAdapter(): RecyclerView.Adapter<CupponHolder>(){

    val testData = listOf(
        CupponItem(R.drawable.cuppon1, 5050, 256),
        CupponItem(R.drawable.cuppon2, 1231, 324),
        CupponItem(R.drawable.cuppon3, 7272, 1231),
        CupponItem(R.drawable.cuppon2, 1238, 432),
        CupponItem(R.drawable.cuppon1, 4019, 89),
        CupponItem(R.drawable.cuppon3, 5123, 126),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CupponHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cupons_fragment_menu_item, parent, false)
        return CupponHolder(view)
    }

    override fun onBindViewHolder(holder: CupponHolder, position: Int) {
        holder.bind(testData[position])
    }

    override fun getItemCount(): Int {
        return testData.size
    }
}