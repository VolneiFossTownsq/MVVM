package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private var viewModel: MainViewModel? = null
    private var welcome: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcome = findViewById(R.id.welcome)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setupBinding()
    }

    private fun setupBinding() {
        viewModel?.welcome()?.observe(this) { textWelcome ->
            welcome?.text = textWelcome
        }
    }
}