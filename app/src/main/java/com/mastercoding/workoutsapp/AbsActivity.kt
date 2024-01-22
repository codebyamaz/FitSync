package com.mastercoding.workoutsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class AbsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abs2)

        val selectedItem = intent.getStringExtra("nameReps")
        val youtubeVideoLink: String = intent.getStringExtra("videolink").toString()
        val detailsNew = intent.getStringExtra("details")
        val focusAreasNew = intent.getStringExtra("focusAreas")
        val animationsViewNew = intent.getIntExtra("animationView", 0)
        val textView = findViewById<TextView>(R.id.exerciseName)
        val details: TextView = findViewById(R.id.details)
        val focusAreas: TextView = findViewById(R.id.focusareas)
        val animationView: LottieAnimationView = findViewById(R.id.animationView)
        textView.text = selectedItem
        details.text = detailsNew
        focusAreas.text = focusAreasNew
        animationView.setAnimation(animationsViewNew)
        animationView.playAnimation()
        val youtubePlayerView: YouTubePlayerView = findViewById(R.id.youtubePlayerView)
        youtubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                // Load the specific YouTube video
                youTubePlayer.loadVideo(youtubeVideoLink, 0f)
                // Disable video suggestions
                youTubePlayer.addListener(object : AbstractYouTubePlayerListener() {
                    override fun onStateChange(
                        youTubePlayer: YouTubePlayer,
                        state: PlayerConstants.PlayerState
                    ) {
                        if (state == PlayerConstants.PlayerState.ENDED) {
                            // Video ended, do something if needed
                        }
                    }
                })
            }
        })


    }
}