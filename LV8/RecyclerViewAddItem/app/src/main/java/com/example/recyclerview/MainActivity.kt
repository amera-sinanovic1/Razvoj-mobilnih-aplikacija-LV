package com.example.recyclerview

import adaptor.ExampleAdaptor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.ExampleItem

//Recycler view for the list of scrollable items

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

        // Add a new item at position 5
        addItemToRecyclerView(5, ExampleItem("New Title", "New Description"))
    }

    private fun generateList(size: Int): MutableList<ExampleItem> {
        val list = mutableListOf<ExampleItem>()
        for (i in 1..size) {
            list.add(ExampleItem("Title $i", "Description: Item $i"))
        }
        return list
    }

    private fun addItemToRecyclerView(position: Int, newItem: ExampleItem) {
        adaptor.addItem(position, newItem) // Add the new item using the adapter's method
    }
}
