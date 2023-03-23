package com.example.hotelsearch.ui.hotelsearch

import androidx.lifecycle.ViewModel
import com.example.hotelsearch.data.repository.HotelsRepository
import com.example.hotelsearch.internal.lazyDeferred

class HotelSearchViewModel(
    private val hotelsRepository: HotelsRepository
) : ViewModel() {


    val hotellist by lazyDeferred {
        hotelsRepository.getHotels("")
    }


}