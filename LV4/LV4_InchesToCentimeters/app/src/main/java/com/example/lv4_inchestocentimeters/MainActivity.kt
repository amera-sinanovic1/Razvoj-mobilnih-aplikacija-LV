package com.example.lv4_inchestocentimeters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var enterInches:EditText
    private lateinit var convertButton:Button
    private lateinit var textViewCentimeters:TextView
    private val inchValue= 2.54

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterInches=findViewById(R.id.editTextInches)
        convertButton=findViewById(R.id.buttonConvert)
        textViewCentimeters=findViewById(R.id.textViewConvert)

        convertButton.setOnClickListener{

            if(!enterInches.text.toString().isBlank()){
                val result= enterInches.text.toString().toDouble() * inchValue
                textViewCentimeters.text= result.toString()
            }else{
                textViewCentimeters.text= getString(R.string.text)
            }

        }

    }

    //import image
    // add imageView
    // dodati plain text ispod slike
    // dodati button ispod text box-a
    // dodati textView ispod button-a
    // daoati id za button buttonConvert
    //dodati id za textView textViewConvert


    // <string name="buttonConvert">Convert to cm</string>
    //button -> text -> @string/buttonConvert



}