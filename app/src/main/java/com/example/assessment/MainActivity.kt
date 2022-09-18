package com.example.assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.PagerAdapter



import androidx.viewpager2.widget.ViewPager2
import com.example.assessment.fragments.FirstFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    //initialise the variables

    private lateinit var toolbar: Toolbar
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //make reference to the toolbar

        toolbar = findViewById(R.id.toolbar)

        //instantiate the Toolbar by calling the variable name
        setSupportActionBar(toolbar)

        //make reference to both ids, so that they can be clickable and activated

        tabLayout = findViewById(R.id.tab)
        viewPager2 = findViewById(R.id.viewPager)

        //after creating a kotlin class called Pager, you come here
        viewPager2.adapter = Pager(supportFragmentManager, lifecycle)
        TabLayoutMediator(tabLayout , viewPager2) { tab, position ->
            when (position) {
                0 -> tab.text = "FirstFrag"
                1 -> tab.text = "SecondFrag"

            }
        }.attach()

        viewPager2.currentItem = 1
    }







    }








