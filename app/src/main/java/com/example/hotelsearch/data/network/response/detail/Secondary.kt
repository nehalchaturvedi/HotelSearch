package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Secondary(
    @SerializedName("icon_temp")
    val iconTemp: IconTempX,
    val mark: Any,
    val text: String,
    @SerializedName("theme_temp")
    val themeTemp: String,
    @SerializedName("__typename")
    val typename: String
)