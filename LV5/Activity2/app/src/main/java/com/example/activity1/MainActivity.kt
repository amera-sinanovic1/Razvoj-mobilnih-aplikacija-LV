package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var switchButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //kreiramo novi activity
        switchButton = findViewById(R.id.button_switch_to_second_activity)
        switchButton.setOnClickListener {
                 // za prebacivanje u drugu activity nam treba klasa intent
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)

            }
    }
}