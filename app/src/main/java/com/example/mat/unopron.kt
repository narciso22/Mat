package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class unopron : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unopron)
    }

    fun nahu1(view: View) {
        finish()
    }
    fun irna1(view: View) {
        var intent = Intent(this, dospron::class.java)
        startActivity(intent)
    }
}