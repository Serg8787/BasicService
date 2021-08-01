package com.example.basicservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btStart.setOnClickListener {
            startService(Intent(this, AudioService::class.java))
            val intent = Intent(this, TestActivity::class.java)
            startActivity(intent)
        }
        btStop.setOnClickListener {
            stopService(Intent(this, AudioService::class.java))
        }
    }
}