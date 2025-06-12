package com.example.wavesoffood

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.example.wavesoffood.databinding.ActivityChooseLocation2Binding

class ChooseLocationActivity2 : AppCompatActivity() {
    private val binding : ActivityChooseLocation2Binding by lazy {
        ActivityChooseLocation2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationList : Array<String> = arrayOf("Jaipur","Chennai","Odisha","Sikar")
        val adapter : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView: AutoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}