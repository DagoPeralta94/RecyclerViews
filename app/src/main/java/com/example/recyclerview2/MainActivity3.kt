package com.example.recyclerview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview2.adapter2.AdapterGridView
import com.example.recyclerview2.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        binding.btEnviar2.setOnClickListener{ goToActivity4() }
    }

    fun initRecyclerView(){
        binding.rvHorizontal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvHorizontal.adapter = AdapterGridView(ListProvider2.gridList)

        binding.rvHorizontal2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvHorizontal2.adapter = AdapterGridView(ListProvider2.gridList)

        binding.rvHorizontal3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvHorizontal3.adapter = AdapterGridView(ListProvider2.gridList)
    }
    fun goToActivity4() {
        val intent = Intent(this, MainActivity4::class.java).apply {  }
        startActivity(intent)
    }
}