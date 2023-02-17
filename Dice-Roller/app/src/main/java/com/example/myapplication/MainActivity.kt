package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
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
        val dice=Dice(6)
        var dicerole=dice.roll()
        var textView1=findViewById<TextView>(R.id.textView)
        textView1.setText(dicerole.toString())
        var imageview:ImageView=findViewById(R.id.imageView)
      /* when(dicerole){
           1->imageview.setImageResource(R.drawable.dice_1)
           2->imageview.setImageResource(R.drawable.dice_2)
           3->imageview.setImageResource(R.drawable.dice_3)
           4->imageview.setImageResource(R.drawable.dice_4)
           5->imageview.setImageResource(R.drawable.dice_5)
           6->imageview.setImageResource(R.drawable.dice_6)

       }*/
        val drawableResource = when (dicerole) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else->R.drawable.dice_6
        }
        imageview.setImageResource(drawableResource)
    }

    class Dice(val num:Int){
        fun roll():Int{
            return (1..num).random()
        }
    }

}