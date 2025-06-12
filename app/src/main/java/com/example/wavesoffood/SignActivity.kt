package com.example.wavesoffood

import android.R.attr.value
import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import androidx.appcompat.app.AppCompatActivity
import com.example.wavesoffood.databinding.ActivitySignBinding

class SignActivity : AppCompatActivity() {
    private val binding: ActivitySignBinding by lazy {
        ActivitySignBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.editTextText.filters = arrayOf(InputFilter.LengthFilter(30)) // Max 30 characters
        binding.editTextTextEmailAddress2.filters =
            arrayOf(InputFilter.LengthFilter(50)) // Max 50 characters
        binding.editTextTextPassword2.filters =
            arrayOf(InputFilter.LengthFilter(15)) // Max 20 characters

        binding.alreadyhavebutton.setOnClickListener {
            val intent = Intent(this, LoginActivity2::class.java)
            startActivity(intent)

        }

        binding.createaccountbutton.setOnClickListener {
            val intent = Intent(this, LoginActivity2::class.java)
            startActivity(intent)
            val myIntent = Intent(this@SignActivity, LoginActivity2::class.java)
            myIntent.putExtra("key", value) //Optional parameters
            this@SignActivity.startActivity(myIntent)
        }

    }
}