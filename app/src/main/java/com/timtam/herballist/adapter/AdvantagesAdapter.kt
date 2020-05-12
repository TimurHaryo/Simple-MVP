package com.timtam.herballist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.timtam.herballist.R

class AdvantagesAdapter(private val advs: ArrayList<String>):
    RecyclerView.Adapter<AdvantagesAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.advantages_list, parent, false)
        return CustomViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val data = advs[position]
        holder.tvDetail.text = data
        holder.tvIndex.text = (position+1).toString() + "."
    }

    override fun getItemCount(): Int {
        return advs.size
    }

    inner class CustomViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvDetail: TextView = view.findViewById(R.id.tvAdvContent) as TextView
        val tvIndex: TextView = view.findViewById(R.id.tvAdvIndex) as TextView
    }

}