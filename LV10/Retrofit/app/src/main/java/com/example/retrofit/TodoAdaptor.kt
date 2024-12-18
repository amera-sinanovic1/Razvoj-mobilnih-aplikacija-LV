package com.example.retrofit // Defines the package for organizing this file

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.databinding.ItemTodoBinding // Import the generated binding class for item layout
import com.plcoding.retrofitcrashcourse.com.example.retrofit.Todo // Import the Todo data class

/**
 * Adapter for displaying a list of Todo items in a RecyclerView.
 * Uses AsyncListDiffer to efficiently manage data updates.
 */
class TodoAdapter : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    /**
     * ViewHolder class for holding the item view.
     * Uses ViewBinding (ItemTodoBinding) to bind views in the layout.
     */
    inner class TodoViewHolder(val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root)

    /**
     * DiffUtil.ItemCallback: Provides efficient comparison of items to optimize RecyclerView performance.
     * - areItemsTheSame: Checks if two items are the same based on their unique IDs.
     * - areContentsTheSame: Checks if the content of two items is identical.
     */
    private val diffCallback = object : DiffUtil.ItemCallback<Todo>() {
        override fun areItemsTheSame(oldItem: Todo, newItem: Todo): Boolean {
            return oldItem.id == newItem.id // Compare unique IDs to determine if items are the same
        }

        override fun areContentsTheSame(oldItem: Todo, newItem: Todo): Boolean {
            return oldItem == newItem // Compare the entire content of items
        }
    }

    /**
     * AsyncListDiffer: Efficiently calculates differences between lists and updates the RecyclerView.
     * This avoids reloading all data unnecessarily.
     */
    private val differ = AsyncListDiffer(this, diffCallback)

    /**
     * List of Todo items managed by the differ.
     * Setting the list automatically triggers diff calculations and updates the RecyclerView.
     */
    var todos: List<Todo>
        get() = differ.currentList // Get the current list from the differ
        set(value) { differ.submitList(value) } // Submit a new list for the differ to process

    /**
     * Returns the total number of items in the list.
     */
    override fun getItemCount() = todos.size

    /**
     * Creates a new ViewHolder for an item.
     * Inflates the layout for each item using ViewBinding.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            ItemTodoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    /**
     * Binds data to the ViewHolder for a specific position.
     * Updates the TextView and CheckBox with the Todo item's details.
     */
    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.apply {
            val todo = todos[position] // Get the Todo item at the current position
            tvTitle.text = todo.title // Set the title of the Todo item
            cbDone.isChecked = todo.completed // Set the CheckBox state based on the completion status
        }
    }
}
