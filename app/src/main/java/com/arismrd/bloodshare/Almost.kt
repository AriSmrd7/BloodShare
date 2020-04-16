package com.arismrd.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Almost : AppCompatActivity() {
    private lateinit var Verif: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)
        Verif = findViewById(R.id.ver_btn_ver)
        Verif.setOnClickListener {
            startActivity(Intent(this, Verify::class.java))
        }
    }
}
