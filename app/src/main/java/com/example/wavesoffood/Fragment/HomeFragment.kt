package com.example.wavesoffood.Fragment

import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes // For ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.MenuBottomSheetFragment
import com.example.wavesoffood.adaptar.PopularAddaptar
import com.example.wavesoffood.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private  lateinit var binding: FragmentHomeBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.ViewAllMenu.setOnClickListener {
            val bottomSheetDialog = MenuBottomSheetFragment()
            bottomSheetDialog.show(parentFragmentManager,"Test")
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(com.example.wavesoffood.R.drawable.banner1, ScaleTypes.FIT))
        imageList.add(SlideModel(com.example.wavesoffood.R.drawable.banner2, ScaleTypes.FIT))
        imageList.add(SlideModel(com.example.wavesoffood.R.drawable.banner3, ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        imageSlider.setItemClickListener(object  : ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPosition = imageList[position]
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(), itemMessage, Toast.LENGTH_SHORT).show()
            }
        })
        val foodName = listOf("Fruit Tart","Quinoa","Icecream","Soup")
        val Price = listOf("$5","$6","$8","$10")
        val populerFoodImages = listOf(com.example.wavesoffood.R.drawable.menu1,com.example.wavesoffood.R.drawable.menu2,com.example.wavesoffood.R.drawable.menu3,com.example.wavesoffood.R.drawable.menu4)
val adapter = PopularAddaptar(foodName, Price, populerFoodImages, requireContext())
        binding.PopulerRecycleView.layoutManager = LinearLayoutManager(requireContext())
        binding.PopulerRecycleView.adapter = adapter
    }

    companion object{
    }
}





