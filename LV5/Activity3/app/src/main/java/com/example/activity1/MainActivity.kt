package com.example.activity1

import android.app.Instrumentation.ActivityResult
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

//Sending Data back from Activities
// 1. Dodati button u layout2
class MainActivity : AppCompatActivity() {
    private lateinit var switchButton: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getResult= registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            //provjera je li data koji smo dobili data koji je psolan iz act2
            if (it.resultCode== Constansts.RESULT_CODE){
                val messsage= it.data!!.getStringExtra(Constansts.INTENT_MESSAGE2_KEY)
                textView.text= messsage

            }
        }
        //kreiramo novi activity
        switchButton = findViewById(R.id.button_switch_to_second_activity)
        textView=findViewById(R.id.textView)
        switchButton.setOnClickListener {
                 // za prebacivanje u drugu activity nam treba klasa intent
            val intent = Intent(this@MainActivity, MainActivity2::class.java)

            intent.putExtra(Constansts.INTENT_MESSAGE_KEY, "Hello from Activity 1")
            intent.putExtra(Constansts.INTENT_MESSAGE2_KEY, "How was your day? ")
            getResult.launch(intent)

            // u activity 2 trebamo prikazati sadrzaj koji smo proslijedili


            }
    }
}