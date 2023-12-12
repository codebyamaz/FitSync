package com.mastercoding.gamesapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.mastercoding.workoutsapp.Abs
import com.mastercoding.workoutsapp.Arms
import com.mastercoding.workoutsapp.Chest
import com.mastercoding.workoutsapp.Legs
import com.mastercoding.workoutsapp.R
import com.mastercoding.workoutsapp.Shoulders

class MyAdapter(private val context: Context, private val data: ArrayList<DataModels>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView)
        val imageView: ImageView = view.findViewById(R.id.exerciseImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.exercises, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.textView.setText(item.exerciseName)
        holder.imageView.setImageResource(item.exerciseImage)
        holder.itemView.setOnClickListener {
            when (position) {
                0 -> {
                    val intent = Intent(context, Abs::class.java)
                    context.startActivity(intent)
                }
                1 ->  {
                    val intent = Intent(context, Chest::class.java)
                    context.startActivity(intent)
                }
                2 -> {
                    val intent = Intent(context, Arms::class.java)
                    context.startActivity(intent)
                }
                3 -> {
                    val intent = Intent(context, Legs::class.java)
                    context.startActivity(intent)
                }
                4 -> {
                    val intent = Intent(context, Shoulders::class.java)
                    context.startActivity(intent)
                }
                else -> Toast.makeText(context, "You clicked on: ${data[position].exerciseName}", Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun getItemCount(): Int {
        return data.size
    }
}
