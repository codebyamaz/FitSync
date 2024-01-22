package com.mastercoding.workoutsapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView

class ChestAdapter(private val context: Context, private val data: ArrayList<ChestData>) : RecyclerView.Adapter<ChestAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val animationView: LottieAnimationView = view.findViewById(R.id.animationChest)
        val nameExercise: TextView = view.findViewById(R.id.nameChest)
        val repsCount: TextView = view.findViewById(R.id.repsChest)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChestAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.chest_layout, parent, false)
        return ChestAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.nameExercise.setText(item.name)
        holder.repsCount.setText(item.reps)
        holder.animationView.setAnimation(item.animation)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, AbsActivity::class.java)
            intent.putExtra("key",item.name)
            intent.putExtra("videolink", item.youtubeVideoLink)
            intent.putExtra("nameReps", item.nameReps)
            intent.putExtra("details", item.details)
            intent.putExtra("focusAreas", item.focusAreas)
            intent.putExtra("animationView", item.animationView)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}
