package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.test1.databinding.ActivityMainBinding
import com.example.test1.presentation.adapter.NewsAdapter
import com.example.test1.presentation.viewmodel.NewsViewModel
import com.example.test1.presentation.viewmodel.NewsViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: NewsViewModelFactory
    @Inject
    lateinit var newsAdapter: NewsAdapter
    lateinit var viewModel: NewsViewModel
    private  var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) // inflate the layout
        setContentView(binding!!.root) // set the content view

        // get the navHostFragment
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        // get the navController
        val navController = navHostFragment.navController
        // set the bottom navigation view with navController
        binding!!.bvnNews.setupWithNavController(navController)

        viewModel = ViewModelProvider(this, factory)[NewsViewModel::class.java]



    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}

