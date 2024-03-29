package com.example.hotelsearch.data.network.response.search


import com.google.gson.annotations.SerializedName

data class Hotel(
    val cityId: String,
    val coordinates: Coordinates,
    val essId: EssId,
    val gaiaId: String,
    val hierarchyInfo: HierarchyInfo,
    val hotelAddress: HotelAddress,
    val hotelId: String,
    val index: String,
    val isMinorAirport: String,
    val regionNames: RegionNames,
    val subtype: String,
    @SerializedName("@type")
    val type: String
)