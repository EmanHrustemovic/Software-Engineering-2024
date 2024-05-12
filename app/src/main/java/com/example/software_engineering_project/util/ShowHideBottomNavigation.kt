package com.example.software_engineering_project.util

import androidx.fragment.app.Fragment
import com.example.software_engineering_project.R
import com.example.software_engineering_project.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.software_engineering_project.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.software_engineering_project.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}