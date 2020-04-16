package com.arismrd.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Verify : AppCompatActivity() {

    private lateinit var GoHome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        GoHome = findViewById(R.id.btn_send_ver)
        GoHome.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
