package me.passos.android.playground.constraintlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(private val items: List<String>) :
        RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                LayoutInflater
                        .from(parent.context)
                        .inflate(android.R.layout.simple_list_item_1, parent, false)
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text = items[position]
    }

    class ViewHolder(
            view: View,
            private val textView: TextView = view.findViewById(android.R.id.text1)
    ) : RecyclerView.ViewHolder(view) {
        var text: CharSequence
            get() = textView.text
            set(value) {
                textView.text = value
            }
    }

}