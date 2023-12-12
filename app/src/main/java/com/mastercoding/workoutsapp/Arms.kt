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

        dataModels.add(ArmsData(R.raw.arms1,"Biceps Curls", "×12"))
        dataModels.add(ArmsData(R.raw.arms2, "Triceps Dips", "×12"))
        dataModels.add(ArmsData(R.raw.arm4, "Reverse Curls", "×12"))
        dataModels.add(ArmsData(R.raw.arms3, "Triceps Push Down", "×12"))
//        dataModels.add(ArmsData(R.raw.ab, "ABC", "×12"))

        var myAdapter: ArmsAdapter = ArmsAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter


    }
}