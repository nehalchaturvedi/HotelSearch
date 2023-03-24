package com.example.hotelsearch.ui.hoteldetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelsearch.databinding.ActivityHotelDetailsBinding
import com.squareup.picasso.Picasso


class HotelDetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityHotelDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHotelDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hotel = DataBindingExample(
            intent.getStringExtra("name") ?: "",
            intent.getDoubleExtra("score", 0.0),
            intent.getStringExtra("price") ?: "",
            intent.getStringExtra("offer") ?: "",
            intent.getStringExtra("image") ?: ""
        )

        binding.hotel = hotel
        Picasso.get().load(hotel.image).into(binding.ivImage)
    }

    class DataBindingExample(
        var name: String,
        var score: Double,
        var price: String,
        var offer: String,
        var image: String

    )
}