package com.example.weather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weather.databinding.FragmentTodayBinding
import com.example.weather.databinding.FragmentTomorrowBinding


class TomorrowFragment : Fragment() {

    private var _binding : FragmentTomorrowBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentTomorrowBinding.inflate(inflater,container,false)

        return binding.root
    }

}