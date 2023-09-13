package com.example.droneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.droneapp.databinding.ActivityMainBinding

private const val NUM_PAGES = 6 // 페이지 수를 정해둠

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: FragmentPageAdapter
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = FragmentPageAdapter(supportFragmentManager, lifecycle)
        viewPager2 = binding.viewpager


        viewPager2.adapter = adapter

        viewPager2.setPageTransformer(ZoomOutPageTransformer())

        binding.indicator.setViewPager(viewPager2)
    }

}