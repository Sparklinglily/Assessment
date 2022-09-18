package com.example.assessment


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assessment.fragments.FirstFragment
import com.example.assessment.fragments.SecondFragment

class Pager(fragMan: FragmentManager, Lc: Lifecycle ) : FragmentStateAdapter(fragMan,Lc){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
       return when(position) {
           0 -> FirstFragment()
           else-> SecondFragment()

       }
    }
}