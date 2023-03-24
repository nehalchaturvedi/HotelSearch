package com.example.hotelsearch.ui.hotelsearch

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelsearch.R
import com.example.hotelsearch.data.network.response.detail.Property
import com.example.hotelsearch.ui.hoteldetails.HotelDetailsActivity
import com.squareup.picasso.Picasso

class HotelsAdapter(private val onClickListener: OnClickListener) : RecyclerView.Adapter<HotelsAdapter.ViewHolder>() {

    var hotels = listOf<Property>()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var ivImage: ImageView
        var ivOffer: ImageView
        var tvTitle: TextView
        var tvContent: TextView
        var tvContent2: TextView

        init {
            ivImage = view.findViewById(R.id.mImageViewCardViewItem)
            tvTitle = view.findViewById(R.id.tvTitle)
            tvContent = view.findViewById(R.id.tvContent)
            tvContent2 = view.findViewById(R.id.tvContent2)
            ivOffer = view.findViewById(R.id.ivOffer)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_view_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = hotels.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hotel = hotels[position]
        holder.tvTitle.text = hotel.name
        holder.tvContent.text = hotel?.offerBadge?.primary?.text ?: ""
        holder.tvContent2.text = String.format("%d/10", hotel.reviews.total)
        if (holder.tvContent.text.isEmpty())
            holder.ivOffer.visibility = View.GONE
        else
            holder.ivOffer.visibility = View.VISIBLE
        holder.itemView.setOnClickListener {
            onClickListener.onClick(hotel)
        }
        Picasso.get().load(hotel.propertyImage.image.url).into(holder.ivImage)
    }

    class OnClickListener(val clickListener: (hotel: Property) -> Unit) {
        fun onClick(hotel: Property) = clickListener(hotel)
    }
}