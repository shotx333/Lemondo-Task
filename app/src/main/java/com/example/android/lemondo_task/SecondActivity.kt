package com.example.android.lemondo_task

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.lemondo_task.adapter.PreparingItemsAdapter
import com.example.android.lemondo_task.model.PreparingItems

class SecondActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var prepareItemsAdapter: PreparingItemsAdapter
    private val data = ArrayList<PreparingItems>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        recyclerView = findViewById(R.id.preparingItems)




        for (i in 1..4) {
            data.add(
                PreparingItems(
                    R.drawable.oval, R.drawable.noun_meal_1556112_copy,
                    R.drawable.noun_scooter_1839674,
                    R.drawable.rectangle_copy_14,
                    R.drawable.ovalgreen
                )
            )

        }

        prepareItemsAdapter = PreparingItemsAdapter(data)

        recyclerView.adapter = prepareItemsAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val button: Button = findViewById(R.id.backB)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}