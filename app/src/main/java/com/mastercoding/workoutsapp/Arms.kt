package com.mastercoding.workoutsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Arms : AppCompatActivity() {

    lateinit var dataModels: ArrayList<ArmsData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arms)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerArms)
        dataModels = ArrayList()
        dataModels.add(ArmsData(R.raw.arms2, "Triceps Dips", "×10","JhX1nBnirNw","Triceps Dips ×10",
        "For the start position, sit on the chair. Then move your hip off the chair with your hands holding the edge of the chair.\n" +
                "\n" +
                "Slowly bend and stretch your arms to make your body go up and down. This is a great exercise for the triceps.",
        "• Triceps", R.raw.arms2))
        dataModels.add(ArmsData(R.raw.absnew6, "Jumping Jacks", "×20","2W4ZNSwoW_4","Jumping Jacks ×20",
        "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hands overhead.\n" +
                "\n" +
                "Return to the start position and do the next rep, This exercise provide a full body workout and works all your large muscle groups.",
        "• Shoulders\n" +
                "• Quadriceps\n" +
                "• Adductors", R.raw.absnew6))
        dataModels.add(ArmsData(R.raw.f, "Diagonal Plank", "×10","OGfFtF-dhrk","Diagonal Plank ×10",
        "Start in the straight arm plank position.\n" +
                "Lift your right arm and left leg until they are parallel with the ground.\n" +
                "Return to the start position and repeat with the other side.",
        "• Abs\n" +
                "• Glutes", R.raw.f))
        dataModels.add(ArmsData(R.raw.shoulder2, "Inchworms", "×8", "ZY2ji_Ho0dA","Inchworms ×8",
        "Start with your feet shoulder width apart.\n" +
                "\n" +
                "Bend your body and walk your hands in front of you as far as you can, then walk your hands back. Repeat the exercise.",
        "• Abs\n" +
                "• Chest", R.raw.shoulder2))
        dataModels.add(ArmsData(R.raw.t, "Military Push Ups", "×12", "H8LoGZ-ZN48", "Military Push Ups ×12",
        "Start in a push-up position with your hands directly under your shoulders and feet no more than 12 inches apart.\n" +
                "\n" +
                "Bend your elbows and lower your body until your upper arms are parallel to the floor. Stay in this position for one second and then push your body back to the starting position and repeat the exercise. Please remember that your elbows should be close to your body during this exercise.",
        "• Chest\n" +
                    "• Triceps", R.raw.t))
        dataModels.add(ArmsData(R.raw.ttt, "Burpees", "×8", "818SkLAPyKY", "Burpees ×8",
        "Stand with your feet shoulder width apart, then put your hands on the ground and kick your feet backward. Do a quick push-up and then jump up.",
        "• Chest\n" +
                "• Abs\n" +
                "• Glutes\n" +
                "• Quadriceps\n" +
                "• Hamstrings", R.raw.ttt))

        var myAdapter: ArmsAdapter = ArmsAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}