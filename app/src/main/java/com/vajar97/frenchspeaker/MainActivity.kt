package com.vajar97.frenchspeaker

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playPhrase(view: View) {
        val mediaPlayer = MediaPlayer.create(
            this,
            resources.getIdentifier(view.tag.toString(), "raw", packageName)
        )
        mediaPlayer.start()
    }
}