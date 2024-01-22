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

        dataModels.add(ChestData(R.raw.absnew6, "Jumping Jacks", "×20","2W4ZNSwoW_4", "JUMPING JACKS ×20",
            "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hands overhead.\n" +
                    "\n" +
                    "Return to the start position and do the next rep, This exercise provide a full body workout and works all your large muscle groups.",
            "• Shoulders\n" +
                    "• Quadriceps\n" +
                    "• Adductors", R.raw.absnew6))
        dataModels.add(ChestData(R.raw.e, "Incline Push Ups", "×10","3WUUeM07i_Q","Incline Push Ups ×10",
        "Start in the regular push-up position but with your hands elevated on a chair or bench.\n" +
                "\n" +
                "Then push your body up down using your arm strength.\n" +
                "\n" +
                "Remember to keep your body straight.",
        "• Chest",
        R.raw.e))
        dataModels.add(ChestData(R.raw.rrr, "Wide Arm Push Ups", "×8","pQUsUHvyoI0", "Wide Arm Push Ups ×8",
        "Start in the regular push-up position but with your hands spread wider than your shoulders.\n" +
                "\n" +
                "Then push your body up and down. Remember to keep your body straight.",
        "• Chest",
        R.raw.rrr))
        dataModels.add(ChestData(R.raw.arms2, "Triceps Dips", "×15","JhX1nBnirNw","Triceps Dips ×15",
        "For the start position, sit on the chair. Then move your hip off the chair with your hands holding the edge of the chair.\n" +
                "\n" +
                "Slowly bend and stretch your arms to make your body go up and down. This is a great exercise for the triceps.",
        "• Triceps",
        R.raw.arms2))
        dataModels.add(ChestData(R.raw.d, "Push Ups", "×8","R08gYyypGto","Push Ups ×8",
            "Lay prone on the ground with arms supporting your body.\n" +
                    "\n" +
                    "Keep your body straight while raising and lowering your body with your arms.\n" +
                    "\n" +
                    "This exercise works the chest, shoulders, triceps, back and legs.",
            "• Chest",R.raw.d))
        dataModels.add(ChestData(R.raw.c, "Knee Push Ups", "×8","jWxvty2KROs","Knee Push Up ×8",
        "Start in the regular push-up position, then let your knees touch the floor and raise your feet up off the floor.\n" +
                "\n" +
                "Next push your body up and down.",
        "• Chest",
        R.raw.c))
        dataModels.add(ChestData(R.raw.absnew1, "Cobra Stretch", "×10","z21McHHOpAg","Cobra Stretch ×10",
        "Lie down on your stomach and bend your elbows with your hands beneath your shoulders.\n" +
                "\n" +
                "Then push your chest up off the ground as far as possible. Hold this position for seconds.",
        "• Abs",R.raw.absnew1))
        dataModels.add(ChestData(R.raw.rr, "Staggered Push Ups", "×10","JWNTTiAQMhc","Staggered Push Ups ×10",
        "Start in the regular push-up position, but with one hand in front of the other.\n" +
                "\n" +
                "Then do a push-up and switch the other hand in front.\n" +
                "\n" +
                "Remember to keep your body straight.",
        "• Chest\n" +
                "• Triceps",R.raw.rr))
        dataModels.add(ChestData(R.raw.tttt, "Arm Circles", "×20","Lha66p0ZXUc","Arm Circles ×20",
        "Stand on the floor with your arms extended straight out to the sides at shoulder height.\n" +
                "\n" +
                "Move your arms forward in circles, and then move backwards.",
        "• Shoulders", R.raw.tttt))
        dataModels.add(ChestData(R.raw.r, "Shoulder Stretch", "×15","9k0EN2RCGgU","Shoulder Stretch ×15",
        "Place one arm across your body, parallel to the ground, then use the other arm to pull the parallel arm toward your chest.\n" +
                "\n" +
                "Hold for a while, switch arms and repeat the exercise. Keep the inside arm straight during the exercise.",
        "• Shoulders",R.raw.r))
        dataModels.add(ChestData(R.raw.ttt, "Burpees", "×10","818SkLAPyKY","Burpees ×10",
        "Stand with your feet shoulder width apart, then put your hands on the ground and kick your feet backward. Do a quick push-up and then jump up.",
        "• Chest\n" +
                "• Abs\n" +
                "• Glutes\n" +
                "• Quadriceps\n" +
                "• Hamstrings", R.raw.ttt))

        var myAdapter: ChestAdapter = ChestAdapter(this, dataModels)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

    }
}