package com.mastercoding.workoutsapp

import com.airbnb.lottie.LottieAnimationView
import java.net.URL

data class AbsData(
    val animation: Int,
    val name: String = "",
    val reps: String = "",
    val youtubeVideoLink: String = "",
    val nameReps: String = "",
    val details: String = "",
    val focusAreas: String = "",
    val animationView: Int = 0
)
