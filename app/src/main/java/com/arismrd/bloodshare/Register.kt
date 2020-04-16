package com.arismrd.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    private lateinit var Send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        Send = findViewById(R.id.reg_btn_reg)
        Send.setOnClickListener {
            startActivity(Intent(this, Almost::class.java))
        }
    }
}
