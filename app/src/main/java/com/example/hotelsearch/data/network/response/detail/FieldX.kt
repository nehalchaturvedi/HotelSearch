package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class FieldX(
    val dropdownFilterOptions: List<DropdownFilterOption>,
    val primary: String,
    val secondary: Any,
    @SerializedName("__typename")
    val typename: String
)