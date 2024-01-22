package com.mastercoding.workoutsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Shoulders : AppCompatActivity() {

    lateinit var dataModels: ArrayList<ShouldersData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoulders)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        dataModels = ArrayList()

        dataModels.add(ShouldersData(R.raw.absnew6,"Jumping Jacks", "×20","2W4ZNSwoW_4","Jumping Jacks ×20",
        "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hands overhead.\n" +
                "\n" +
                "Return to the start position and do the next rep, This exercise provide a full body workout and works all your large muscle groups.",
        "• Shoulders\n" +
                "• Quadriceps\n" +
                "• Adductors", R.raw.absnew6))
        dataModels.add(ShouldersData(R.raw.shoulder1,"Shoulder Stretch", "×12","9k0EN2RCGgU", "Shoulder Stretch ×12",
        "Place one arm across your body, parallel to the ground, then use the other arm to pull the parallel arm toward your chest.\n" +
                "\n" +
                "Hold for a while, switch arms and repeat the exercise. Keep the inside arm straight during the exercise.",
        "• Shoulders", R.raw.shoulder1))
        dataModels.add(ShouldersData(R.raw.shoulder2, "Inchworms", "×12","ZY2ji_Ho0dA","Inchworms ×12",
        "Start with your feet shoulder width apart.\n" +
                "\n" +
                "Bend your body and walk your hands in front of you as far as you can, then walk your hands back. Repeat the exercise.",
        "• Abs\n" +
                "• Chest", R.raw.shoulder2))

        var myAdapter: ShouldersAdapter = ShouldersAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

    }
}