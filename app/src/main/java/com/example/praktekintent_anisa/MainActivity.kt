package com.example.praktekintent_anisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext: Button = findViewById(R.id.btnNext)
        val btnShare: Button=findViewById(R.id.btnShare)

        btnNext.setOnClickListener{
            val intent= Intent(this,intent_anisa2::class.java)
            startActivity(intent)
        }
        btnShare.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}