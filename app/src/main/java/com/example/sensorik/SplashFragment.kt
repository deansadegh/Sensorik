package com.example.sensorik

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.sensorik.databinding.FragmentLoginBinding
import com.example.sensorik.databinding.FragmentSplashBinding
import kotlinx.coroutines.delay

class SplashFragment : Fragment() {
    lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        splash()
        binding = FragmentSplashBinding.inflate(inflater, container, false)

        return binding.root
    }
    fun splash() {
        lifecycleScope.launchWhenCreated {
            delay(1000)
            findNavController().navigate(R.id.login)
        }
    }
}