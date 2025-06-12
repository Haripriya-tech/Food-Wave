package com.example.wavesoffood.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.R
import com.example.wavesoffood.databinding.FragmentHistoryBinding
import com.example.wavesoffood.adaptar.BuyAgainAdapter


class HistoryFragment : Fragment() {
    private lateinit var binding: FragmentHistoryBinding
    private lateinit var buyAgainAdapter: BuyAgainAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(layoutInflater, container, false)
        setupRecyclerView()
        return binding.root
    }
   private fun setupRecyclerView() {
       val buyAgainFoodName = arrayListOf("Fruit Tart","Quinoa","Ice Cream")
       val buyAgainFoodPrice = arrayListOf("$10","$0","$30")
       val buyAgainFoodImage = arrayListOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3)
       buyAgainAdapter = BuyAgainAdapter(buyAgainFoodName,buyAgainFoodPrice,buyAgainFoodImage)
       binding.BuyAgainRecyclerView.adapter = buyAgainAdapter
       binding.BuyAgainRecyclerView.layoutManager = LinearLayoutManager(requireContext())


   }
    companion object {

    }
}