package com.example.menusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menusapp.databinding.ActivityEjemploMenuContextualBinding

class EjemploMenuContextualActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjemploMenuContextualBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjemploMenuContextualBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}