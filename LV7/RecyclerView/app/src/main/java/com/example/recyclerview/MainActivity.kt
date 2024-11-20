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
    private lateinit var adaptor:ExampleAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //prayan projekat
        //potrebno kreirati adaptor
        // napraviti novi layout - Relative layout
        //kreiramo 3 nova paleta utils, model i adaptop
        // u model dodajemo kt classu exampleItem

        val exampleList = generateList(100)
        recyclerView = findViewById(R.id.recyclerView)
        adaptor = ExampleAdaptor(this, exampleList) // exampleList contains 100 items
        recyclerView.adapter = adaptor
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val exampleList1 = generateList(100)
        Log.d("MainActivity", "List size: ${exampleList1.size}") // This should log 100
    }

    private fun generateList(size: Int): MutableList<ExampleItem> {
        val list = mutableListOf<ExampleItem>()
        for (i in 1..size) { // Loop from 1 to size (inclusive)
            list.add(ExampleItem("Title $i", "Description: Item $i"))
        }
        return list
    }
}