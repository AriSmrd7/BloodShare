package com.arismrd.bloodshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var intent = intent
        val nama = intent.getStringExtra("Nama")
        val goldar = intent.getStringExtra("Blood")

        //tampilin ke textview
        val DataNama = findViewById<TextView>(R.id.home_tv_nama)
        DataNama.text = nama

        val DataDarah = findViewById<TextView>(R.id.home_tv_blood)
        DataDarah.text = "Blood Type : " + goldar

    }
}
