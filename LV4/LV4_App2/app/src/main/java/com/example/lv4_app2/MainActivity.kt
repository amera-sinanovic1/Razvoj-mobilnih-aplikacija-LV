package com.example.lv4_app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var myButton:Button
    private lateinit var myTextView:TextView
    private lateinit var editText:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myButton=findViewById(R.id.myButton)
        myTextView = findViewById(R.id.myTextView)
        editText= findViewById(R.id.editText)

        myButton.text=getString(R.string.button)


        myButton.setOnClickListener {
            // U input spremi uneseni tekst
            //dodati novi plain text sa hintom
            //Unesi svoje ime:

            val input = editText.text.toString()
           // myTextView.visibility= View.VISIBLE
            //myTextView.text= "Hello Amera"
            //ispisi tekst
            //myTextView.text= input
            //dodatno provjeravamo je input prazan
            if (!input.isEmpty()){
                myTextView.visibility= View.VISIBLE
                myTextView.text= input
            }else {
                //dodala u stringse novi name
                myTextView.text= getString(R.string.emptyInput)
            }

        }





    }

    // u layoutu postavi text visibility na nevidljiv
    // zelimo klikom na button da se pojavi text
    //fun showMessage(view: View){
      //  myTextView.visibility= View.VISIBLE
      //  myTextView.text= "Hello Amera"
    //}


}