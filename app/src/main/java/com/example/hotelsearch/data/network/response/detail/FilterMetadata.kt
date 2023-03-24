package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class FilterMetadata(
    val amenities: List<Amenity>,
    val neighborhoods: List<Neighborhood>,
    //val priceRange: PriceRange,
    @SerializedName("__typename")
    val typename: String
)