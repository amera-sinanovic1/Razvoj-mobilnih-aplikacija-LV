package com.example.activity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var textViewData:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val data= intent.extras
        textViewData=findViewById(R.id.textView2Data)
        //provjeravamo je li data prayno ? elvis operator

        data?.let{
            val message1=data.getString(Constansts.INTENT_MESSAGE_KEY)
            val message2=data.getString(Constansts.INTENT_MESSAGE2_KEY)

            textViewData.text= message1 + "\n" + message2

        }
    }
}