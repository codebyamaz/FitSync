package com.mastercoding.workoutsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mastercoding.gamesapp.DataModels
import com.mastercoding.gamesapp.MyAdapter

class MainActivity : AppCompatActivity() {

//    lateinit var dataModels: ArrayList<DataModels>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportActionBar?.title = "HOME WORKOUT"

        Handler().postDelayed({
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
            finish()
        },1200)
//
//        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)
//
//        dataModels = ArrayList()
//        dataModels.add(DataModels("ABS", R.drawable.img_14))
//        dataModels.add(DataModels("CHEST", R.drawable.img_12))
//        dataModels.add(DataModels("ARMS", R.drawable.img_10))
//        dataModels.add(DataModels("LEGS", R.drawable.img_15))
//        dataModels.add(DataModels("SHOULDERS", R.drawable.img_7))
//
//        var myAdapter: MyAdapter = MyAdapter(this, dataModels)
//        recyclerView.setHasFixedSize(true)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = myAdapter

    }
}