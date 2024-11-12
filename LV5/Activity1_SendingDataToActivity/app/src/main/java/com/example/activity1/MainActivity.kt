package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//Sending data to another activity
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

            intent.putExtra(Constansts.INTENT_MESSAGE_KEY, "Hello from Activity 1")
            intent.putExtra(Constansts.INTENT_MESSAGE2_KEY, "How was your day? ")
            startActivity(intent)
            // u activity 2 trebamo prikazati sadrzaj koji smo proslijedili


            }
    }
}