package com.example.databasecrud

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextMessage: EditText
    private lateinit var saveButton: Button
    private lateinit var textViewMessage: TextView
    private lateinit var sharedPref: SharedPreferences
    private val PREF_NAME = "myPrefs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextMessage = findViewById(R.id.edit_text_mesage)
        saveButton = findViewById(R.id.saveButton)
        textViewMessage = findViewById(R.id.textViewMessage)

        // Initialize SharedPreferences
        sharedPref = getSharedPreferences(PREF_NAME, MODE_PRIVATE)

        // Save button click listener
        saveButton.setOnClickListener {
            val message = editTextMessage.text.toString()
            if (message.isNotEmpty()) {
                val editor = sharedPref.edit()
                editor.putString("message", message)
                editor.apply()
                textViewMessage.text = message // Update TextView immediately
            } else {
                textViewMessage.text = "Please enter a message."
            }
        }

        // Retrieve the saved message on app launch
        if (sharedPref.contains("message")) {
            val message = sharedPref.getString("message", "Not found")
            textViewMessage.text = message
        }
    }
}