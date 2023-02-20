package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener { calculetip() }
    }

    private fun calculetip() {
        binding.calculateButton.text="hi iman"
        val stringInTextField:Double = binding.textview1.text.toString().toDouble()
        val selectedId = binding.tipOptions.checkedRadioButtonId

    }
}