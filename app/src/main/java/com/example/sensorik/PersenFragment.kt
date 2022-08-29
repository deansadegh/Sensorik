package com.example.sensorik

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sensorik.databinding.FragmentHomeBinding
import com.example.sensorik.databinding.FragmentPersenBinding

class PersenFragment : Fragment() {
    lateinit var binding: FragmentPersenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPersenBinding.inflate(inflater, container, false)
        return binding.root
    }
}