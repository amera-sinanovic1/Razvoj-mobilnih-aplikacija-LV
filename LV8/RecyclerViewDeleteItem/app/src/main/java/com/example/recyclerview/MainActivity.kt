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

        // Remove item number 5 (index 4, since index is 0-based)
        removeItemFromRecyclerView(4) // 4 is the index for item number 5
    }

    private fun generateList(size: Int): MutableList<ExampleItem> {
        val list = mutableListOf<ExampleItem>()
        for (i in 1..size) {
            list.add(ExampleItem("Title $i", "Description: Item $i"))
        }
        return list
    }

    private fun removeItemFromRecyclerView(index: Int) {
        adaptor.removeItem(index) // Remove item using the adapter's method
    }
}
