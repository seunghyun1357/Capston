package com.example.capstone.heartList

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.capstone.R

class FirstaidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstaid)

        val imageButton1: ImageButton = findViewById(R.id.imageButton1)
        imageButton1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.e-gen.or.kr/egen/first_aid_basics.do"))
            startActivity(intent)
        }

        val imageButton2: ImageButton = findViewById(R.id.imageButton2)
        imageButton2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.e-gen.or.kr/app/contents2Basics.do"))
            startActivity(intent)
        }
    }
}
