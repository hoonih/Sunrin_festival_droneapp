package com.example.droneapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.droneapp.FirstPageFragment
import com.example.droneapp.FivePageFragment
import com.example.droneapp.FourPageFragment
import com.example.droneapp.SecondPageFragment
import com.example.droneapp.SixPageFragment
import com.example.droneapp.ThirdPageFragment

class FragmentPageAdapter (
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 6
    }

    override fun createFragment(position: Int): Fragment {
        return if ( position == 0 )
            FirstPageFragment()
        else if (position == 1)
            SecondPageFragment()
        else if (position == 2)
            ThirdPageFragment()
        else if (position == 3)
            FourPageFragment()
        else if (position == 4)
            FivePageFragment()
        else
            SixPageFragment()
    }

}