package com.mastercoding.workoutsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Legs : AppCompatActivity() {

    lateinit var dataModels: ArrayList<LegsData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legs)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        dataModels = ArrayList()

        dataModels.add(LegsData(R.raw.squats,"Squats", "×12","42bFodPahBU","Squats ×12",
        "Stand with your feet shoulder width apart and your arms stretched forward, then lower your body until your thighs are parallel with the floor.\n" +
                "\n" +
                "Your knees should be extended in the same direction as your toes. Return to the start position and do the next rep.\n" +
                "\n" +
                "This works the thighs, hips buttocks, quads, hamstrings and lower body.",
        "• Glutes\n" +
                "• Quadriceps", R.raw.squats))
        dataModels.add(LegsData(R.raw.absnew6,"Jumping Jacks", "×20","2W4ZNSwoW_4","Jumping Jacks ×20",
        "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hands overhead.\n" +
                "\n" +
                "Return to the start position then do the next rep. This exercise provides a full-body workout and works all your large muscle groups.",
        "• Shoulders\n" +
                "• Quadriceps\n" +
                "• Adductors", R.raw.absnew6))
        dataModels.add(LegsData(R.raw.ttt,"Burpees", "×10","818SkLAPyKY","Burpees ×10",
        "Stand with your feet shoulder width apart, then put your hands on the ground and kick your feet backward. Do a quick push-up and then jump up.",
        "• Chest\n" +
                "• Abs\n" +
                "• Glutes\n" +
                "• Quadriceps\n" +
                "• Hamstrings", R.raw.ttt))
//        dataModels.add(LegsData(R.raw.legs2, "Dead-lifts", "×12"))
//        dataModels.add(LegsData(R.raw.legs4, "Leg Press", "×12"))
//        dataModels.add(LegsData(R.raw.leg5, "Leg Rotation", "×12"))

        var myAdapter: LegsAdapter = LegsAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter


    }
}