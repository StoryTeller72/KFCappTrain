package com.example.kfcmain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kfcmain.databinding.ActivityMainBinding
import com.example.kfcmain.fragments.BascketFragment
import com.example.kfcmain.fragments.CuponsFragment
import com.example.kfcmain.fragments.MenuFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var bottomBasketFragment: BascketFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()
        val navView: BottomNavigationView = binding.bottomBar
        navView.setupWithNavController(navController)
        binding.bottomBar.setOnItemSelectedListener {
            when(it.itemId){
                R.id.basketBtn ->  createBasket()
                R.id.menuFragment -> supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, MenuFragment.newInstance()).commit()
                R.id.cuponsFragment -> supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, CuponsFragment.newInstance()).commit()
            }
            true
        }
    }

    fun createBasket(){
        bottomBasketFragment = BascketFragment()
        bottomBasketFragment.show(supportFragmentManager,"DialogFragment")
    }
}

