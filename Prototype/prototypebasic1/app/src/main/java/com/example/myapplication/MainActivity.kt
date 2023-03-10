package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var list=ArrayList<Data>()

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageButton.setOnClickListener { Ajoutertache() }
    }

    fun Ajoutertache() {
        var nom=binding.editTextTextPersonName.text.toString()
        Toast.makeText(this,nom,Toast.LENGTH_LONG).show()
        list.add(Data(nom))
        binding.myrecyclerView.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        var adapter=MyAdapter(list)
        binding.myrecyclerView.adapter=adapter
    }
}