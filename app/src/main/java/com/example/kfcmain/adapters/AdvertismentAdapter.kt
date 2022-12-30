package com.example.kfcmain.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.R
import com.example.kfcmain.adapters.items.AdvertisementItem
import com.example.kfcmain.databinding.AdvertismentItemBinding

class AdvertisementAdapter(): RecyclerView.Adapter<AdvertisementAdapter.AdvertismentHolder>() {

    val dataAd = listOf(
        AdvertisementItem(R.drawable.first),
        AdvertisementItem(R.drawable.second),
        AdvertisementItem(R.drawable.third),
        AdvertisementItem(R.drawable.forth),
        AdvertisementItem(R.drawable.fifth),
        )

    class AdvertismentHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = AdvertismentItemBinding.bind(view)

        fun bind(item: AdvertisementItem){
            binding.ivAdImage.setImageResource(item.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdvertismentHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.advertisment_item, parent, false)
        return AdvertismentHolder(view)
    }

    override fun onBindViewHolder(holder: AdvertismentHolder, position: Int) {
        holder.bind(dataAd[position])
    }

    override fun getItemCount(): Int {
        return dataAd.size
    }
}