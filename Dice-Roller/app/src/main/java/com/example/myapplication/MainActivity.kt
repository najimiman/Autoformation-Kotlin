package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun random(view: View) {
        //var textView1=findViewById<TextView>(R.id.textView)
        //textView1.setText("6")
        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        Roledice()
    }

    private fun Roledice() {
        val dice=Dice(10)
        var dicerole=dice.roll()
        var textView1=findViewById<TextView>(R.id.textView)
        textView1.setText(dicerole.toString())
        //var textView1:TextView=findViewById(R.id.textView)
        //textView1.text=dicerole.toString()
    }

    class Dice(val num:Int){
        fun roll():Int{
            return (1..num).random()
        }
    }

}