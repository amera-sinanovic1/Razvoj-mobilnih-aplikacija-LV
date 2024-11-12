package com.example.activity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var textViewData:TextView
    private lateinit var goBackButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val data= intent.extras
        textViewData=findViewById(R.id.textView2Data)
        goBackButton=findViewById(R.id.buttonGoBack)
        //provjeravamo je li data prayno ? elvis operator
        goBackButton.setOnClickListener(){
            //dodat cemo jos jednu constantu u utils
            val intent= intent
            intent.putExtra(Constansts.INTENT_MESSAGE2_KEY, "Hello from Activity 2.")
            setResult(Constansts.RESULT_CODE,intent)
            finish()
            //vrati se u main activity i napisi kod koji hvada data koji saljemo

        }
        data?.let{
            val message1=data.getString(Constansts.INTENT_MESSAGE_KEY)
            val message2=data.getString(Constansts.INTENT_MESSAGE2_KEY)

            textViewData.text= message1 + "\n" + message2

        }
    }
}