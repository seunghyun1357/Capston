package com.example.capstone.heartList

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.capstone.R

class CprActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpr)

        val cprButton = findViewById<ImageButton>(R.id.cprButton)

        cprButton.setOnClickListener {
            val youtubeUrl = "https://www.youtube.com/shorts/LmuyIBT7JqY" // 심폐소생술 비디오 URL로 변경하세요
            openYoutubeVideo(youtubeUrl)
        }

        val aedButton = findViewById<ImageButton>(R.id.aedButton)

        aedButton.setOnClickListener {
            val youtubeUrl = "https://www.youtube.com/shorts/kIgvGI2Se84" // 심폐소생술 비디오 URL로 변경하세요
            openYoutubeVideo(youtubeUrl)
        }
    }

    private fun openYoutubeVideo(videoUrl: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
        intent.setPackage("com.google.android.youtube")

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            // YouTube 앱이 설치되어 있지 않을 경우 브라우저로 열기
            intent.setPackage(null)
            startActivity(intent)
        }
    }
}
