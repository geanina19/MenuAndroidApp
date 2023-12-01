package com.example.menusapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.menusapp.databinding.ActivityEjer2Menu1Binding

class Ejer2Menu1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjer2Menu1Binding

    enum class Params {
        USERNAME
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjer2Menu1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.menu1)

        //(Params.USERNAME.name) = "username" -> convierte en string
        //.getStringExtra -> coge String, si fuera int sería (.getIntExtra)
        val username = intent.getStringExtra(Ejer2Menu2Activity.Params.USERNAME.name)
        if(username != null) {
            binding.textViewNombre1.text = username
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //carga esto en la actividad
        menuInflater.inflate(R.menu.action_bar_ejer2_menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //con el Intent abrimos otra actividad
        val intent = Intent (
            this,
            Ejer2Menu2Activity::class.java
        )

        /*le decimos que además de que abra la acividad display,
        añada la info pasada en el editText*/
        intent.putExtra (
            Ejer2Menu2Activity.Params.USERNAME.name,
            binding.nombre1.text.toString()
        )

        startActivity(intent)

        return super.onOptionsItemSelected(item)
    }
}