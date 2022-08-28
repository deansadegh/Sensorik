package com.example.sensorik

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.navigation.fragment.findNavController
import com.example.sensorik.databinding.FragmentLoginBinding
import com.google.android.material.textfield.TextInputEditText


class LoginFragment : Fragment() {
lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val text = binding.text2 as TextInputEditText
        val value = text.text.toString()
        return binding.root    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.text1.doOnTextChanged { text, start, before, count ->
            binding.textIn.error="NO More!"
            if (text!!.length>8){
            }else if (text!!.length<8){
                binding.textIn.error=null
            }

        }
        binding.text2.doOnTextChanged { text, start, before, count ->
            binding.textIn2.error="NO more"
            if (text!!.length>10){
            }else if (text!!.length<10){
                binding.textIn2.error=null
            }

        }
        binding.loginBtn.setOnClickListener {

            when {
                binding.text1.text.toString() == "" && binding.text2.text.toString() == "" -> {
                    binding.textIn.error="Empty!"
                    binding.textIn2.error="Empty!"
                }
                binding.text2.text.toString() == "" -> {
                    binding.textIn2.error="Empty!"
                }
                binding.text1.text.toString() == "" -> {
                    binding.textIn.error="Empty!"
                }
                else -> {
                    findNavController().navigate(R.id.home)

                }
            }

        }

    }
}

