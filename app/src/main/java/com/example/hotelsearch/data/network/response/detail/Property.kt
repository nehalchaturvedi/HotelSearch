package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Property(
    val availability: Availability,
    val destinationInfo: DestinationInfo,
    val featuredMessages: List<Any>,
    val id: String,
    val legalDisclaimer: Any,
    val listingFooter: Any,
    val mapMarker: MapMarker,
    val name: String,
    val neighborhood: NeighborhoodX,
    val offerBadge: OfferBadge,
    val offerSummary: OfferSummary,
    val pinnedDetails: Any,
    val price: Price,
    val priceAfterLoyaltyPointsApplied: PriceAfterLoyaltyPointsApplied,
    val priceMetadata: PriceMetadata,
    val propertyFees: List<PropertyFee>,
    val propertyImage: PropertyImage,
    val regionId: String,
    val reviews: Reviews,
    val saveTripItem: Any,
    val sponsoredListing: Any,
    val star: Any,
    val supportingMessages: Any,
    @SerializedName("__typename")
    val typename: String
)