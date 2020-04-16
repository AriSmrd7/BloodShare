package com.arismrd.bloodshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var register: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register = findViewById(R.id.textregister)
        register.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }
}
