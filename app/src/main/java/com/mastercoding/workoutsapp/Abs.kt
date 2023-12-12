package com.mastercoding.workoutsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mastercoding.gamesapp.DataModels
import com.mastercoding.gamesapp.MyAdapter

class Abs : AppCompatActivity() {

    lateinit var dataModels: ArrayList<AbsData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abs)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerAbs)

        dataModels = ArrayList()
        dataModels.add(AbsData(R.raw.animatee,"Crunches", "×12"))
        dataModels.add(AbsData(R.raw.abs4, "Plank", "×12"))
        dataModels.add(AbsData(R.raw.abs3, "Russian Twists", "×12"))
        dataModels.add(AbsData(R.raw.abs5, "Seated Circles", "×12"))
        dataModels.add(AbsData(R.raw.abs6, "Flutter Kicks", "×12"))

        var myAdapter: AbsAdapter = AbsAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}