package com.example.android.lemondo_task.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.lemondo_task.R
import com.example.android.lemondo_task.model.OrderItems

class OrderItemsAdapter(private val list: List<OrderItems>) :
    RecyclerView.Adapter<OrderItemsAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.order_items, parent, false)

        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {

        val orderItems = list[position]
        holder.hat.setImageResource(orderItems.hatImage)
        holder.line.setImageResource(orderItems.lineImage)
        holder.underLine.setImageResource(orderItems.underlineImage)
        holder.preparingBold.setImageResource(orderItems.preparingBoldImage)
        holder.shortLine.setImageResource(orderItems.shortLineImage)
        holder.amount.text = orderItems.amountNumber
        holder.price.text = orderItems.amountPrice

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hat: ImageView = itemView.findViewById(R.id.hat)
        val line: ImageView = itemView.findViewById(R.id.straightLine)
        val underLine: ImageView = itemView.findViewById(R.id.underLine)
        val preparingBold: ImageView = itemView.findViewById(R.id.preparingBold)
        val amount: TextView = itemView.findViewById(R.id.amount)
        val price: TextView = itemView.findViewById(R.id.price)
        val shortLine: ImageView = itemView.findViewById(R.id.shortLine)
    }

}