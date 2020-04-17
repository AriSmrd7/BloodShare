package com.arismrd.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_verify.*

class Verify : AppCompatActivity() {

    lateinit var GoHome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        var intent = intent
        val nama = intent.getStringExtra("Nama")
        val goldar = intent.getStringExtra("Blood")

        btn_send_ver.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Blood", goldar)
            startActivity(intent)
        }
    }
}
