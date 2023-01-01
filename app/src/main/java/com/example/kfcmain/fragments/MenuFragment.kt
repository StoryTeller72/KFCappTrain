package com.example.kfcmain.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kfcmain.R
import com.example.kfcmain.adapters.AdapterWithDelegate
import com.example.kfcmain.adapters.AdvertisementAdapter
import com.example.kfcmain.adapters.MenuCategoryAdapter
import com.example.kfcmain.adapters.ProductDelegate
import com.example.kfcmain.adapters.HeaderDelegate
import com.example.kfcmain.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        binding.rcAdvertisement.adapter = AdvertisementAdapter()
        binding.rcMenuCategory.adapter = MenuCategoryAdapter()
        binding.rcHeadersProducts.adapter = AdapterWithDelegate(
            delegates = listOf(
                ProductDelegate(),
                HeaderDelegate(),
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
        return binding.root
    }
}