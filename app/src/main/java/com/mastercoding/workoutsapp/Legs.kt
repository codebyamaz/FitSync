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

        dataModels.add(LegsData(R.raw.squats,"Squats", "×12"))
        dataModels.add(LegsData(R.raw.legs2, "Deadlifts", "×12"))
        dataModels.add(LegsData(R.raw.legs4, "Leg Press", "×12"))
        dataModels.add(LegsData(R.raw.leg5, "Leg Rotation", "×12"))

        var myAdapter: LegsAdapter = LegsAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter


    }
}