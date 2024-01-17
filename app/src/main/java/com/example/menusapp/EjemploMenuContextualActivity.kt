package com.example.menusapp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import com.example.menusapp.databinding.ActivityEjemploMenuContextualBinding

class EjemploMenuContextualActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjemploMenuContextualBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjemploMenuContextualBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    /*
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        when (v?.id)
        {
            binding.myBoton.id -> {
                menuInflate.inflate(R.menu.colores_menu, menu)
            }

            binding.otroBoton.id -> {
                menuInflate.inflate(R.menu.colores_menu, menu)
            }
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.redOption -> {
                item.actionView?.setBackgroundColor(Color.RED)
            }

            R.id.redOption -> {
                item.actionView?.setBackgroundColor(Color.RED)
            }
        }*/
    }