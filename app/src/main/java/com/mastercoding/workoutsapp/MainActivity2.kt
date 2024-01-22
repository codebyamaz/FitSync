package com.mastercoding.workoutsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mastercoding.gamesapp.DataModels
import com.mastercoding.gamesapp.MyAdapter

class MainActivity2 : AppCompatActivity() {

    lateinit var dataModels: ArrayList<DataModels>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.title = "HOME WORKOUT"

        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        dataModels = ArrayList()
        dataModels.add(DataModels("ABS", R.drawable.img_14))
        dataModels.add(DataModels("CHEST", R.drawable.img_12))
        dataModels.add(DataModels("ARMS", R.drawable.img_10))
        dataModels.add(DataModels("LEGS", R.drawable.img_15))
        dataModels.add(DataModels("SHOULDERS", R.drawable.img_7))

        var myAdapter: MyAdapter = MyAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

    }
}