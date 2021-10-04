package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var tabItem1: TabItem
    lateinit var tabItem2: TabItem
    lateinit var tabItem3: TabItem
    lateinit var viewPager: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        tabItem1 = findViewById(R.id.tabItem1)
        tabItem2 = findViewById(R.id.tabItem2)
        tabItem3 = findViewById(R.id.tabItem3)
        viewPager= findViewById(R.id.viewPager)

    }
}