package com.example.lv4_app1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.new_layout)

        //findViewById - poveyati button UI sa button objektom u kodu
        var button:Button
        button= findViewById(R.id.button2)
        //button.text="Login button"
        button.setTextColor(Color.RED)

        //STRING xml
        // Otvoriti values-> strings.xml

        button.text= getString(R.string.button_text)





    }
}