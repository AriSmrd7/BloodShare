package com.arismrd.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_almost.*


class Almost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)

        var intent = intent
        val nama = intent.getStringExtra("Nama")
        val goldar = intent.getStringExtra("Blood")

        al_btn_al.setOnClickListener {
            val intent = Intent(this, Verify::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Blood", goldar)
            startActivity(intent)
        }
    }
}
