package com.example.wavesoffood

import android.R.attr.value
import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import androidx.appcompat.app.AppCompatActivity
import com.example.wavesoffood.databinding.ActivityLogin2Binding

class LoginActivity2 : AppCompatActivity() {
    private val binding: ActivityLogin2Binding by lazy {
        ActivityLogin2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.editTextTextEmailAddress.filters =
            arrayOf(InputFilter.LengthFilter(50)) // Max 50 characters
        binding.editTextTextPassword.filters =
            arrayOf(InputFilter.LengthFilter(15)) // Max 20 characters
        binding.loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            val myIntent = Intent(this@LoginActivity2, MainActivity::class.java)
            myIntent.putExtra("key", value) //Optional parameters
            this@LoginActivity2.startActivity(myIntent)
        }
        binding.donthavebutton.setOnClickListener {
            val intent = Intent(this, SignActivity::class.java)
            startActivity(intent)
        }
    }
}