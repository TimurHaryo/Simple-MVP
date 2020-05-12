package com.timtam.herballist.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.timtam.herballist.R
import com.timtam.herballist.activity.ContentActivity
import com.timtam.herballist.model.Plants

class PlantsAdapter(private val context: Context, private val plants: List<Plants>):
    RecyclerView.Adapter<PlantsAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return CustomViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val data = plants[position]
        holder.myItem.text = data.name
        holder.myIndex.text = (position+1).toString()
        holder.myCat.text = data.category
        holder.ivMain.setImageResource(data.image)
        holder.btnToContent.setOnClickListener {
            passData(data.name, data.desc, data.image, data.category, data.latinName, data.usage, data.advantages)
        }
    }

    override fun getItemCount(): Int {
        return plants.size
    }

    inner class CustomViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var myItem: TextView = view.findViewById(R.id.myPlants) as TextView
        var myIndex: TextView = view.findViewById(R.id.tvIndex) as TextView
        var myCat: TextView = view.findViewById(R.id.tvCategory) as TextView
        var ivMain: ImageView = view.findViewById(R.id.imageViewMain) as ImageView
        var btnToContent: ConstraintLayout = view.findViewById(R.id.btnToContent)
    }

    private fun passData(name: String, desc: String, image: Int, category: String,
                         latinName: String, usage: String, advs: ArrayList<String>) {
        val bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("desc", desc)
        bundle.putInt("image", image)
        bundle.putString("category", category)
        bundle.putString("latinName", latinName)
        bundle.putString("usage", usage)
        bundle.putStringArrayList("advs", advs)

        val intent = Intent(context, ContentActivity::class.java)
        intent.putExtras(bundle)
        context.startActivity(intent)
    }
}