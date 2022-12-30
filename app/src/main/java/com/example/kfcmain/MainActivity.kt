package com.example.kfcmain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
import androidx.core.view.isVisible
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
        binding.appbarLayoutMain.addOnOffsetChangedListener{_, offset ->
            val toolbarHeight = binding.cvVyvozInAppbar.height
            if(toolbarHeight + offset < 0){
                binding.tvKfc.visibility = View.GONE
                binding.cvVyvozToolbar.visibility = View.VISIBLE
                binding.ivAvatar.setImageResource(R.drawable.avatar_without_back)
            }else{
                binding.tvKfc.visibility = View.VISIBLE
                binding.ivAvatar.setImageResource(R.drawable.avatar_with_back)
                binding.cvVyvozToolbar.visibility = View.GONE
            }
        }
    }


}