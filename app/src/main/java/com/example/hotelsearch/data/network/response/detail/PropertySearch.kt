package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PropertySearch(
    val clickstream: Clickstream,
    val filterMetadata: FilterMetadata,
    val map: Map,
    val properties: List<Property>,
    val propertySearchListings: List<PropertySearchListings>,
    val searchCriteria: SearchCriteria,
    val shoppingContext: ShoppingContext,
    val summary: Summary,
    @SerializedName("__typename")
    val typename: String,
    val universalSortAndFilter: UniversalSortAndFilter
)