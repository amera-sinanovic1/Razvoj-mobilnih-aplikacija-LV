package com.example.checkbox1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var checkBoxKotlin:CheckBox
    private lateinit var checkBoxC:CheckBox
    private lateinit var checkBoxPython:CheckBox
    private lateinit var textViewSelected:TextView
    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBoxC=findViewById(R.id.checkBoxC)
        checkBoxKotlin=findViewById(R.id.checkBoxKotlin)
        checkBoxPython=findViewById(R.id.checkBoxPython)
        textViewSelected=findViewById(R.id.textViewSeleted)
        button= findViewById(R.id.button)
        button.setOnClickListener(){
            val sb= StringBuilder()
            sb.append(checkBoxKotlin.text.toString() + "status is: " + checkBoxKotlin.isChecked + "\n")
            sb.append(checkBoxC.text.toString() + "status is: " + checkBoxC.isChecked + "\n")
            sb.append(checkBoxPython.text.toString() + "status is: " + checkBoxPython.isChecked + "\n")
            textViewSelected.text= sb.toString()

        }
    }
}