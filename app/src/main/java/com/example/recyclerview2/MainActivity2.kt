package com.example.recyclerview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview2.adapter2.AdapterGridView
import com.example.recyclerview2.databinding.ActivityMain2Binding
import com.example.recyclerview2.databinding.ItemVerticalBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler2()
        binding.btEnviar2.setOnClickListener{ goToActivity3() }

    }

    fun initRecycler2(){
        binding.rvVertica2l.layoutManager = GridLayoutManager(this,3)
        binding.rvVertica2l.adapter = AdapterGridView(ListProvider2.gridList)
    }

    fun goToActivity3() {
        val intent = Intent(this, MainActivity3::class.java).apply {  }
        startActivity(intent)
    }
}