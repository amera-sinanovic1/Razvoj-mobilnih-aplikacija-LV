package com.example.retrofit // Defines the package for organizing this file

import android.content.ContentValues.TAG // For logging purposes
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log // To log errors or information
import androidx.core.view.isVisible // Provides extension for visibility handling
import androidx.lifecycle.lifecycleScope // Coroutine scope tied to the lifecycle of the Activity
import androidx.recyclerview.widget.LinearLayoutManager // LayoutManager for RecyclerView
import com.example.retrofit.databinding.ActivityMainBinding // Generated binding class for activity_main.xml

import retrofit2.HttpException // Represents HTTP-related errors
import java.io.IOException // Represents network connection errors

/**
 * Main activity that displays a list of Todo items in a RecyclerView.
 * It fetches data asynchronously from the API and updates the UI.
 */
class MainActivity : AppCompatActivity() {

    // Binding object for accessing views in activity_main.xml
    private lateinit var binding: ActivityMainBinding

    // Adapter for managing and displaying Todo items in the RecyclerView
    private lateinit var todoAdapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout and initialize the binding object
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup the RecyclerView with adapter and layout manager
        setupRecyclerView()

        // Fetch data from the API asynchronously
        lifecycleScope.launchWhenCreated {
            binding.progressBar.isVisible = true // Show progress bar while loading data

            // Make the API call and handle exceptions
            val response = try {
                RetrofitInstance.api.getTodos() // Fetch the list of todos
            } catch (e: IOException) {
                Log.e(TAG, "IOException, you might not have internet connection") // Log network error
                binding.progressBar.isVisible = false // Hide progress bar
                return@launchWhenCreated // Exit the coroutine
            } catch (e: HttpException) {
                Log.e(TAG, "HttpException, unexpected response") // Log HTTP error
                binding.progressBar.isVisible = false // Hide progress bar
                return@launchWhenCreated // Exit the coroutine
            }

            // Handle the response
            if (response.isSuccessful && response.body() != null) {
                todoAdapter.todos = response.body()!! // Update the adapter's data
            } else {
                Log.e(TAG, "Response not successful") // Log unsuccessful response
            }

            binding.progressBar.isVisible = false // Hide progress bar after handling response
        }
    }

    /**
     * Initializes the RecyclerView with its adapter and layout manager.
     */
    private fun setupRecyclerView() = binding.rvToDos.apply {
        todoAdapter = TodoAdapter() // Initialize the adapter
        adapter = todoAdapter // Set the adapter for the RecyclerView
        layoutManager = LinearLayoutManager(this@MainActivity) // Set the layout manager
    }
}
