package com.example.kfcmain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
import com.example.kfcmain.adapters.AdapterWithDelegate
import com.example.kfcmain.adapters.AdvertisementAdapter
import com.example.kfcmain.adapters.MenuCategoryAdapter
import com.example.kfcmain.adapters.ProductDelegate
import com.example.kfcmain.adapters.items.HeaderDelegate
import com.example.kfcmain.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rcAdvertisement.adapter = AdvertisementAdapter()
        binding.rcMenuCategory.adapter = MenuCategoryAdapter()
        binding.rcHeadersProducts.adapter = AdapterWithDelegate(
            delegates = listOf(
                ProductDelegate(this),
                HeaderDelegate(this),
            )
        )
    }
}