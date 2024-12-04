package adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import model.ExampleItem
class ExampleAdaptor(val context: Context, val elements: MutableList<ExampleItem>) :
    RecyclerView.Adapter<ExampleAdaptor.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_layout, parent, false)
        return ExampleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return elements.size
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = elements[position]
        holder.title.text = currentItem.title
        holder.description.text = currentItem.description
    }

    // Method to add an item
    fun addItem(position: Int, item: ExampleItem) {
        if (position >= 0 && position <= elements.size) { // Ensure position is valid
            elements.add(position, item)
            notifyItemInserted(position)
            notifyItemRangeChanged(position, elements.size) // Update the list display
        }
    }

    inner class ExampleViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val title: TextView = view.findViewById(R.id.title)
        val description: TextView = view.findViewById(R.id.description)

        init {
            view.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = elements[position]
                    Toast.makeText(context, "Clicked: ${item.title}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
