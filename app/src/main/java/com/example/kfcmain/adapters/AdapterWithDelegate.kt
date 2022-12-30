package com.example.kfcmain.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kfcmain.R
import com.example.kfcmain.adapters.items.Category
import com.example.kfcmain.adapters.items.ListItem
import com.example.kfcmain.adapters.items.Product


class AdapterWithDelegate(
    private val delegates: List<Delegate>,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val items = listOf<ListItem>(
        Category("Бургеры"),
        Product("Бургер 1",  279,R.drawable.burger1),
        Product("Бургер 2",  221,R.drawable.burger2),
        Product("Бургер 3",  79,R.drawable.burger3),
        Category("Десерты"),
        Product("Десерт 1",  29,R.drawable.desert1),
        Product("Десерт 2",  129,R.drawable.desert3),
        Category("Соусы"),
        Product("Соус 1",  129,R.drawable.souce2),
    )

    override fun getItemViewType(position: Int): Int =
        delegates.indexOfFirst { delegates -> delegates.forItem(items[position]) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        delegates[viewType].getViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegates[getItemViewType(position)].bindViewHolder(holder, items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

