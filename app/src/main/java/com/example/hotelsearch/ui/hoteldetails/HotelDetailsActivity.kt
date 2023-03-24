package com.example.hotelsearch.ui.hoteldetails

import android.R
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.hotelsearch.databinding.ActivityHotelDetailsBinding
import com.squareup.picasso.Picasso


//Shows detailed views of hotels selected from recycler view
class HotelDetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityHotelDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHotelDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //DataBinding used to display Hotel information.
        val hotel = DataBindingExample(
            intent.getStringExtra("name") ?: "",
            intent.getDoubleExtra("score", 0.0),
            intent.getStringExtra("price") ?: "",
            intent.getStringExtra("offer") ?: "",
            intent.getStringExtra("image") ?: ""
        )

        binding.hotel = hotel
        Picasso.get().load(hotel.image).into(binding.ivImage)
        enableGoBack()
    }

    private fun enableGoBack() {
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return true
    }

    class DataBindingExample(
        var name: String,
        var score: Double,
        var price: String,
        var offer: String,
        var image: String

    )
}