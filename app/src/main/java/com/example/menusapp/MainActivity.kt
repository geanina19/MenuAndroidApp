package com.example.menusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menusapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.actionBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //carga esto en la actividad
        menuInflater.inflate(R.menu.action_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.actionBarOpt1 -> {
                Toast.makeText(
                    this,
                    "Opción 1 ejecutada",
                    Toast.LENGTH_SHORT)
                    .show()
                true
            }

            R.id.actionBarOpt2 -> {
                Toast.makeText(
                    this,
                    "Opción 2 ejecutada",
                    Toast.LENGTH_SHORT)
                    .show()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }


    }
}