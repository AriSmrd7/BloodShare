package com.arismrd.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    /* 16/04/2020
    *  10117162
    *  ARISUMARDI
    *  IF4
    * */
    var BloodType: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val Nama = findViewById<EditText>(R.id.input_user_reg)
        val jenis_darah = resources.getStringArray(R.array.gol_dar)

        //akses spinner
        val sblood = findViewById<Spinner>(R.id.spinner_blood_reg)
        if (sblood != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, jenis_darah
            )
            sblood.adapter = adapter

            sblood.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    BloodType = sblood.getSelectedItem().toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
            }
        }


        val Send = findViewById<Button>(R.id.reg_btn_reg)
        Send.setOnClickListener {
            var name = Nama.text.toString()
            var jdarah = BloodType.toString()

            //validasi
            if (name.equals("")) {
                Toast.makeText(this, "Masukkan Usernamenya :)", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (jdarah.equals("Blood Type")) {
                Toast.makeText(this, "Pilih Golongan Darahnya :)", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (!cb_term_reg.isChecked()) {
                Toast.makeText(
                    this,
                    "Mohon Check Ketentuan dan Kebijakannya :)",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            } else {
                val intent = Intent(this, Almost::class.java)
                intent.putExtra("Nama", name)
                intent.putExtra("Blood", jdarah)
                startActivity(intent)
            }
        }
    }
}
