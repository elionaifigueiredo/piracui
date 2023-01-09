package com.br.piracui.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.br.piracui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // como não tem construtor nessa classe , lateinit ( variavel inicia tardeamente)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // em java

        // private ActivityMainBinding binding;
        // binding.ActivityMainBinding.inflate(getLayoutInflater());
        // setContentView(binding.getRoot());


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // o root ja sabe que é o activity_main.xml para exiibir

        setupRefreshPratos();
        setupListarPratos();
        setupFloatingActionButton();
    }

    private fun setupFloatingActionButton() {
        TODO("Criar evento de Click e etc ...")
    }

    private fun setupRefreshPratos() {
        TODO("Atualizar os Pratos")
    }

    fun setupListarPratos() {
        TODO("Nossa API")



    }

}