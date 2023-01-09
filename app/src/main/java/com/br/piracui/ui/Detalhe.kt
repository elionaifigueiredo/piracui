package com.br.piracui.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.br.piracui.databinding.ActivityDetalheBinding

class Detalhe : AppCompatActivity() {

    // lateinit devido não ser iniciliazada/criada no construtor
    private lateinit var binding: ActivityDetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // action bar personalizada
        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}