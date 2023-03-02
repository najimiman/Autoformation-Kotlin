package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import com.example.myapplication.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.jvm.internal.Intrinsics.Kotlin
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener { calculetip() }
    }

    private fun calculetip() {
        /*binding.calculateButton.text="hi iman"
        val stringInTextField:Double = binding.textview1.text.toString().toDouble()
        val selectedId = binding.tipOptions.checkedRadioButtonId*/
        val edittext1=binding.editext1.text.toString()
        val cost=edittext1.toDouble()
        val selectid=binding.tipOptions.checkedRadioButtonId
        val tippersentage=when(selectid){
            R.id.option_twenty_percent->0.20
            R.id.option_eighteen_percent->0.18
            else->0.15
        }
        var tip = tippersentage * cost
        val roundUp = binding.roundUpSwitch.isChecked
        if(roundUp){
            tip= kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}