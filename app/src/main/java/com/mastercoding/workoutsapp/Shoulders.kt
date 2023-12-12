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

        dataModels.add(ShouldersData(R.raw.shoulder1,"Shoulder Stretch", "×12"))
        dataModels.add(ShouldersData(R.raw.shoulder2, "Inchworms", "×12"))
//        dataModels.add(ShouldersData(R.raw.ab, "ABC", "×12"))
//        dataModels.add(ShouldersData(R.raw.ab, "ABC", "×12"))
//        dataModels.add(ShouldersData(R.raw.ab, "ABC", "×12"))

        var myAdapter: ShouldersAdapter = ShouldersAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

    }
}