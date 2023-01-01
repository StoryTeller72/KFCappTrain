package com.example.kfcmain.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kfcmain.adapters.CupponAdapter
import com.example.kfcmain.databinding.FragmentCuponsBinding


class CuponsFragment : Fragment() {
    private var _binding : FragmentCuponsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCuponsBinding.inflate(inflater, container, false)
        with(binding){
            fragmentCuponsRecyclerViewMenu.adapter = CupponAdapter()
        }
        return binding.root
    }
}