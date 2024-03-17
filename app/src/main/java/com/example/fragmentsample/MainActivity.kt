package com.example.fragmentsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var First_fragment : First_fragment
    private lateinit var Second_fragment : Second_fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        First_fragment = First_fragment()
        Second_fragment = Second_fragment()
        supportFragmentManager.beginTransaction()
            .add(binding.fragment1.id,First_fragment)
            .commit()
        supportFragmentManager.beginTransaction()
            .add(binding.fragment2.id,Second_fragment)
            .commit()
        binding.btn1.setOnClickListener {
            startActivity(Intent(this@MainActivity,MainActivity2::class.java))
        }
    }
}