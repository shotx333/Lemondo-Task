package com.example.android.lemondo_task

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.lemondo_task.adapter.OrderItemsAdapter
import com.example.android.lemondo_task.model.OrderItems

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var oderItemsAdapter: OrderItemsAdapter
    private val data = ArrayList<OrderItems>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerView = findViewById(R.id.items)




        for (i in 1..3) {
            when (i) {
                1 -> data.add(
                    OrderItems(
                        R.drawable.oval,
                        R.drawable.line_2_copy_4,
                        R.drawable.rectangle_copy_21,
                        R.drawable.shape,
                        "x4",
                        R.drawable.rectangle_copy_14,
                        "56.30"
                    )
                )
                2 -> data.add(
                    OrderItems(
                        R.drawable.oval,
                        R.drawable.line_2_copy_4,
                        R.drawable.rectangle_copy_20,
                        R.drawable.shape,
                        "x1",
                        R.drawable.rectangle_copy_14,
                        "12.80"
                    )
                )
                3 -> data.add(
                    OrderItems(
                        R.drawable.oval,
                        R.drawable.line_2_copy_4,
                        R.drawable.rectangle_copy_22,
                        R.drawable.shape,
                        "x1",
                        R.drawable.rectangle_copy_14,
                        "12.00"
                    )
                )
            }


        }

        oderItemsAdapter = OrderItemsAdapter(data)

        recyclerView.adapter = oderItemsAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val button: Button = findViewById(R.id.nextB)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }


}