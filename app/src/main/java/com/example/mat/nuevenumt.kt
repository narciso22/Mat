package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class nuevenumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevenumt)
    }

    fun bents39(view: View) {
        var intent = Intent(this, dieznumt::class.java)
        startActivity(intent)
    }
    fun btntc39(view: View) {
        finish()
    }
    fun audio39(view: View) {
        val parent = findViewById<Button>(R.id.audio29)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.nuevet)
            mp.start()
        }
    }
}