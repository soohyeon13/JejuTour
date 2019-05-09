package com.example.user.jejutour

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class TourRvAdapter(val context: Context, val tourList : ArrayList<Tour>) : RecyclerView.Adapter<TourRvAdapter.Holder>() {
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(tourList[position],context)

    }

    override fun getItemCount(): Int {
        return tourList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.tour_rv_item,parent,false)
        return Holder(view)
    }


    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val tourPhoto = itemView?.findViewById<ImageView>(R.id.tourPhoto)
        val tourName = itemView?.findViewById<TextView>(R.id.tourName)
        val tourplaces = itemView?.findViewById<TextView>(R.id.tourplaces)

        fun bind(tour: Tour, context: Context) {

            if (tour.photo != "") {
                val resourceId = context.resources.getIdentifier(tour.photo,"drawable",context.packageName)
                tourPhoto?.setImageResource(resourceId)
            }else {
                tourPhoto?.setImageResource(R.drawable.sangumburi)
            }
            tourName?.text = tour.name
            tourplaces?.text = tour.places
        }
    }
}