package com.example.kfcmain.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.R
import com.example.kfcmain.adapters.items.MenuItem
import com.example.kfcmain.databinding.MenuItemBinding

class MenuCategoryAdapter(): RecyclerView.Adapter<MenuCategoryAdapter.MenuCategoryHolder>() {

    val dataCategory = listOf(
        MenuItem("Бургеры"),
        MenuItem("Напитки"),
        MenuItem("Десерты"),
        MenuItem("Благотворительность"),
        MenuItem("Купоны"),
        MenuItem("Новинки"),
        MenuItem("Соусы"),
    )

    class MenuCategoryHolder(view: View): RecyclerView.ViewHolder(view) {
        private val binding = MenuItemBinding.bind(view)

        fun bind(item: MenuItem){
            binding.tvCategoryTitle.text = item.categoryTitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuCategoryHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)
        return MenuCategoryHolder(view)
    }

    override fun onBindViewHolder(holder: MenuCategoryHolder, position: Int) {
        holder.bind(dataCategory[position])
    }

    override fun getItemCount(): Int {
        return dataCategory.size
    }
}
