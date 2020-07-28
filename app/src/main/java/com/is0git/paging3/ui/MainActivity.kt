package com.is0git.paging3.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.annotation.NavigationRes
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.replace
import androidx.navigation.NavGraph
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.is0git.paging3.R
import com.is0git.paging3.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        createNavHostFragment(R.navigation.main_nav_graph, R.id.mainNavHostFragment)
    }

    private fun createNavHostFragment(@NavigationRes navGraphId: Int, @IdRes containerViewId: Int) {
        val navHostFragment = NavHostFragment.create(navGraphId)
        supportFragmentManager.beginTransaction()
            .replace(containerViewId, navHostFragment)
            .commit()
    }
}
