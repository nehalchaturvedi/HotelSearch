package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class MultiSelectionOption(
    val analytics: Analytics,
    val default: Boolean,
    val description: String,
    val deselectAnalytics: DeselectAnalytics,
    val disabled: Boolean,
    val icon: Any,
    val id: String,
    val primary: String,
    val secondary: String,
    val selectAnalytics: SelectAnalytics,
    val selected: Boolean,
    @SerializedName("__typename")
    val typename: String,
    val value: String
)