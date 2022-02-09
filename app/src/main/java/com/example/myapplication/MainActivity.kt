package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("hjkli","on create started")


    }

    override fun onStart() {
        super.onStart()
        Log.d("start","start has been started")
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume","resume has been started")

    }

    override fun onPause() {
        super.onPause()
        Log.d("pause","pause has started")
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop","stop implemented")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("restart","restart please")
    }
}