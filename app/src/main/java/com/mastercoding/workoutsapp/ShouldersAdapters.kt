package com.mastercoding.workoutsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView

class ShouldersAdapter(private val context: Context, private val data: ArrayList<ShouldersData>) : RecyclerView.Adapter<ShouldersAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val animationView: LottieAnimationView = view.findViewById(R.id.animationView)
        val nameExercise: TextView = view.findViewById(R.id.nameExercise)
        val repsCount: TextView = view.findViewById(R.id.repsCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShouldersAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.legs_layout, parent, false)
        return ShouldersAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.nameExercise.setText(item.name)
        holder.repsCount.setText(item.reps)
        holder.animationView.setAnimation(item.animation)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}
