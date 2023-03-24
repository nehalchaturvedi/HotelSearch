package com.example.hotelsearch.data.network.request


import com.google.gson.annotations.SerializedName

data class Room(
    val adults: Int,
    val children: List<Children>
)