package com.example.hotelsearch.ui.hoteldetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelsearch.R
import com.example.hotelsearch.data.network.response.detail.Property
import com.example.hotelsearch.databinding.ActivityHotelDetailsBinding
import com.example.hotelsearch.databinding.ActivityMainBinding

class HotelDetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityHotelDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHotelDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var hotel = DataBindingExample(
            intent.getStringExtra("name") ?: "",
            intent.getDoubleExtra("score", 0.0),
            intent.getStringExtra("price") ?: "",
            intent.getStringExtra("offer") ?: "",
        )

        binding.hotel = hotel
    }

    class DataBindingExample(
        var name: String,
        var score: Double,
        var price: String,
        var offer: String

    )
}