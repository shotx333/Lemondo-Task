package com.example.android.lemondo_task.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.lemondo_task.R
import com.example.android.lemondo_task.model.PreparingItems

class PreparingItemsAdapter(private val list: List<PreparingItems>) :
    RecyclerView.Adapter<PreparingItemsAdapter.MyHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.preparing_items, parent, false)

        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val preparingItems = list[position]

        holder.hat.setImageResource(preparingItems.p_Hat_Image)
        holder.scooter.setImageResource(preparingItems.scooterImage)
        holder.prepare.setImageResource(preparingItems.preparingImage)
        holder.smallLine.setImageResource(preparingItems.smallLineImage)
        holder.circle.setImageResource(preparingItems.ovalImage)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val hat: ImageView = itemView.findViewById(R.id.pHat)
        val scooter: ImageView = itemView.findViewById(R.id.scooter)
        val prepare: ImageView = itemView.findViewById(R.id.preparing)
        val smallLine: ImageView = itemView.findViewById(R.id.smallLine)
        val circle: ImageView = itemView.findViewById(R.id.circle)
    }
}