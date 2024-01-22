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
        dataModels.add(AbsData(R.raw.absnew6,"Jumping Jacks", "×20","2W4ZNSwoW_4", "JUMPING JACKS ×20",
        "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hands overhead.\n" +
                "\n" +
                "Return to the start position and do the next rep, This exercise provide a full body workout and works all your large muscle groups.",
        "• Shoulders\n" +
                "• Quadriceps\n" +
                "• Adductors", R.raw.absnew6))
        dataModels.add(AbsData(R.raw.a, "Abdominal Crunches", "×16","RUNrHkbP4Pc",
        "Abdominal Crunches ×16",
        "Lie on your back with your knees bent and your arms stretched forward. Then lift your upper body off the floor. Hold for a few seconds and slowly return. It primarily works the rectus abdominis muscle and the obliques.",
        "• Abs",
            R.raw.a))
        dataModels.add(AbsData(R.raw.absnew3, "Russian Twists", "×20","DJQGX2J4IVw", "Russian Twists ×20",
        "Sit on the floor with your knees bend, feet lifted a little bit and back titled backwards.\n" +
                "\n" +
                "Then hold your hands together and twist from side to side.",
                "• Abs", R.raw.absnew3))
        dataModels.add(AbsData(R.raw.absnew2, "Mountain Climber", "×16","wQq3ybaLZeA", "Mountain Climber ×16",
        "Start in the push-up position. Bend your right knee towards your chest and keep your left leg straight, then quickly switch from one leg to the other.\n" +
                "\n" +
                "This exercise strengthens multiple muscle groups.","• Abs\n" +
                    "• Glutes\n" +
                    "• Lower back\n" +
                    "• Quadriceps\n" +
                    "• Calves", R.raw.absnew2))
        dataModels.add(AbsData(R.raw.absnew4, "Leg Raises", "×16","dGKbTKLnym4", "Leg Raises ×16",
        "Lie down on your back, and put your hands beneath your hips for support.\n" +
                "\n" +
                "Then lift your legs up until they form a right angle with the floor.\n" +
                "\n" +
                "Slowly bring your legs back down and repeat the exercise.","• Abs", R.raw.absnew4))
        dataModels.add(AbsData(R.raw.absnew1, "Cobra Stretch", "×10","z21McHHOpAg", "Cobra Stretch ×10",
        "Lie down on your stomach and bend your elbows with your hands beneath your shoulders.\n" +
                "\n" +
                "Then push your chest up off the ground as far as possible. Hold this position for seconds.","• Abs", R.raw.absnew1))
        dataModels.add(AbsData(R.raw.h, "Butt Bridge", "×20","9qo48CYN06w",
        "Butt Bridge ×20",
            "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hands overhead.\n" +
                    "\n" +
                    "Return to the start position then do the next rep. This exercise provides a full-body workout and works all your large muscle groups.",
        "• Glutes", R.raw.h))
        dataModels.add(AbsData(R.raw.l, "V Up", "×20",
        "5kvKmRGADlQ",
        "V Up ×20",
        "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hands overhead.\n" +
                "\n" +
                "Return to the start position then do the next rep. This exercise provides a full-body workout and works all your large muscle groups.",
        "• Abs", R.raw.l))
        dataModels.add(AbsData(R.raw.k, "Sit Ups", "×20","swOyWKk7Oko",
        "Sit Ups ×20",
        "Lie on your back with your hands behind your ears.\n" +
                "\n" +
                "Then lift your upper body off the floor and slowly up to the sitting position. Don't tug your neck when you get up.\n" +
                "\n" +
                "Slowly go back to the start position and repeat the exercise.\n" +
                "\n" +
                "If your spine hurts, please change to another workout.",
        "• Abs", R.raw.k))
        var myAdapter: AbsAdapter = AbsAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}