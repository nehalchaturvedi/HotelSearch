package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class UniversalSortAndFilter(
    val applyAction: ApplyAction,
    val filterSections: List<FilterSection>,
    val revealAction: RevealAction,
    val sortSections: List<SortSection>,
    val toolbar: Toolbar,
    @SerializedName("__typename")
    val typename: String
)