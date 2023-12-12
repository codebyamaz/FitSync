package com.mastercoding.workoutsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AbsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abs2)

        val selectedItem = intent.getStringExtra("key")

        // Now you can use the selectedItem string in your activity as needed
        // For example, set it to a TextView
        val textView = findViewById<TextView>(R.id.exerciseName)
        textView.text = selectedItem

    }
}