package com.mastercoding.workoutsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Chest : AppCompatActivity() {

    lateinit var dataModels: ArrayList<ChestData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chest)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerChest)

        dataModels = ArrayList()

        dataModels.add(ChestData(R.raw.chest1,"Bench Press", "×12"))
        dataModels.add(ChestData(R.raw.chest2, "Push Ups", "×12"))
//        dataModels.add(ChestData(R.raw.ab, "ABC", "×12"))
//        dataModels.add(ChestData(R.raw.ab, "ABC", "×12"))
//        dataModels.add(ChestData(R.raw.ab, "ABC", "×12"))

        var myAdapter: ChestAdapter = ChestAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

    }
}