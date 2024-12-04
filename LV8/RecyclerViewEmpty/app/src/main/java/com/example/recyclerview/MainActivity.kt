package com.example.recyclerview

import adaptor.ExampleAdaptor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.ExampleItem

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adaptor: ExampleAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Generate list with 100 items
        val exampleList = generateList(100)
        recyclerView = findViewById(R.id.recyclerView)
        adaptor = ExampleAdaptor(this, exampleList)
        recyclerView.adapter = adaptor
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        // Add 'addItemToRecyclerView' call here (if needed in the future)

        // Add 'removeItemFromRecyclerView' call here (if needed in the future)
    }

    private fun generateList(size: Int): MutableList<ExampleItem> {
        val list = mutableListOf<ExampleItem>()
        for (i in 1..size) {
            list.add(ExampleItem("Title $i", "Description: Item $i"))
        }
        return list
    }
}
