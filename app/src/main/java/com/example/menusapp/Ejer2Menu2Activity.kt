package com.example.menusapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.menusapp.databinding.ActivityEjer2Menu1Binding
import com.example.menusapp.databinding.ActivityEjer2Menu2Binding

class Ejer2Menu2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjer2Menu2Binding

    enum class Params {
        USERNAME
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjer2Menu2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.menu2)

        //(Params.USERNAME.name) = "username" -> convierte en string
        //.getStringExtra -> coge String, si fuera int sería (.getIntExtra)
        val username = intent.getStringExtra(Params.USERNAME.name)

        binding.textViewNombre2.text = username
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //carga esto en la actividad
        menuInflater.inflate(R.menu.action_bar_ejer2_menu2, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //con el Intent abrimos otra actividad
        val intent = Intent (
            this,
            Ejer2Menu1Activity::class.java
        )

        /*le decimos que además de que abra la acividad display,
        añada la info pasada en el editText
         */
        intent.putExtra (
            Ejer2Menu1Activity.Params.USERNAME.name,
            binding.nombre2.text.toString()
        )

        startActivity(intent)

        return super.onOptionsItemSelected(item)
    }
}