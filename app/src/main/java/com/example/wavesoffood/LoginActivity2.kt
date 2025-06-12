package com.example.wavesoffood

import android.R.attr.value
import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.wavesoffood.databinding.ActivityLogin2Binding

class LoginActivity2 : AppCompatActivity() {
    private val binding: ActivityLogin2Binding by lazy {
        ActivityLogin2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.editTextTextEmailAddress.filters = arrayOf(InputFilter.LengthFilter(50)) // Max 50 characters
        binding.editTextTextPassword.filters = arrayOf(InputFilter.LengthFilter(15)) // Max 20 characters
        Log.d("Rakshita", "onCreate: Clicked line 27")
        binding.loginButton.setOnClickListener {
            Log.d("Rakshita", "onCreate: Clicked line 28")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            val myIntent: Intent = Intent(this@LoginActivity2, MainActivity::class.java)
            myIntent.putExtra("key", value) //Optional parameters
            this@LoginActivity2.startActivity(myIntent)
         }

        binding.donthavebutton.isClickable=true
        binding.donthavebutton.setOnClickListener {
            Log.d("Rakshita", "onCreate: Clicked line 32")
            val intent = Intent(this, SignActivity::class.java)
            Log.d("Rakshita", "onCreate: Clicked $intent")
            startActivity(intent)
        }
    }
}