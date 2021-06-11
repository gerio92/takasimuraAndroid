package com.example.takasimura.Fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.appcompat.app.AppCompatViewInflater
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.viewpager.widget.ViewPager
import com.example.takasimura.R
import com.example.takasimura.adapters.AdapterSlider

class HomeFragment : Fragment() {

    lateinit var vpSlider: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.activity_home_fragment, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)

        var arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.gambar1)
        arrSlider.add(R.drawable.gambar2)
        arrSlider.add(R.drawable.gambar3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        return view
    }
}