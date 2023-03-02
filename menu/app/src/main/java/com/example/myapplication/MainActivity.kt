package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val myinflater=menuInflater
        myinflater.inflate(R.menu.main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.item1->{
                Toast.makeText(this,"Login",Toast.LENGTH_LONG).show()
               //var intent= Intent(this,login::class.java)
                //startActivity(intent)
            }
            R.id.item2->{
                Toast.makeText(this,"Inscription",Toast.LENGTH_LONG).show()
            }
            R.id.item3->{
                //Toast.makeText(this,"out",Toast.LENGTH_LONG).show()
            finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}