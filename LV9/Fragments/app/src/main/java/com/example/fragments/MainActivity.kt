package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonFragment1:Button
    lateinit var ButtonFragment2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment= FirstFragment()
        val secondFragment= SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment, firstFragment)
            commit()
            
        }
        ButtonFragment1=findViewById(R.id.ButtonFragment1)
        ButtonFragment2=findViewById(R.id.ButtonFragment2)

        ButtonFragment1.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, firstFragment)
                commit()

            }
        }
        ButtonFragment2.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, secondFragment)
                commit()

            }
        }
    }
}