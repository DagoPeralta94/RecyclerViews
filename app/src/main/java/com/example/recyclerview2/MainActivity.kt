package com.example.recyclerview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bumptech.glide.Glide
import com.example.recyclerview2.adapter.AdapterVerticalView
import com.example.recyclerview2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        binding.btEnviar.setOnClickListener{ goToActivity2() }
    }

    fun initRecyclerView(){
        binding.rvVertical.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvVertical.adapter = AdapterVerticalView(ListProvider.verticalList)
    }

    fun goToActivity2() {
        val intent = Intent(this, MainActivity2::class.java).apply {  }
        startActivity(intent)
    }
}