package com.example.hotelsearch.ui.hotelsearch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.hotelsearch.data.repository.HotelsRepository


class HotelSearchViewModelFactory(
    private val repository: HotelsRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HotelSearchViewModel(repository) as T
    }
}
