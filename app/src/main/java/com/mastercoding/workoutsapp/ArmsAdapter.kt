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

class ArmsAdapter(private val context: Context, private val data: ArrayList<ArmsData>) : RecyclerView.Adapter<ArmsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val animationView: LottieAnimationView = view.findViewById(R.id.animationArms)
        val nameExercise: TextView = view.findViewById(R.id.nameArms)
        val repsCount: TextView = view.findViewById(R.id.repsArms)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArmsAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.arms_layout, parent, false)
        return ArmsAdapter.ViewHolder(view)
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
