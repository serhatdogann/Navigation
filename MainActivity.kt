package com.example.nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.nav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottom.background=null
        binding.bottom.menu.getItem(1).isEnabled=false


        navController=Navigation.findNavController(this,R.id.fragmentContainerView2)
        NavigationUI.setupWithNavController(binding.bottom,navController)


        binding.fav.setOnClickListener {
            navController.popBackStack()
            navController.navigate(R.id.searchFragment)
        }

    }
}