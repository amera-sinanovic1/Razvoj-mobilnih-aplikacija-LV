package com.example.lv4_seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast

// dodaj seekBar u layoutu
// promijeni widith u xml-u na match_parent
//dodaj textView
//<string name="text_view_text">Rate</string>
// dodaj text za text view (korak iznad)

class MainActivity : AppCompatActivity() {
    private lateinit var seekBar:SeekBar
    private lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar=findViewById(R.id.seekBar)
        textView=findViewById(R.id.textView)

        seekBar.setOnSeekBarChangeListener (object:OnSeekBarChangeListener{
            //generate -> implement methods
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Toast.makeText(this@MainActivity ,"onProgressChanged ",Toast.LENGTH_SHORT).show()
                textView.text="Rate =" + seekBar.progress.toString()

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                Toast.makeText(this@MainActivity ,"onStartTrackingTouch ",Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                Toast.makeText(this@MainActivity ,"onStopTrackingTouch",Toast.LENGTH_SHORT).show()
                textView.text="Final rate =" + seekBar.progress.toString()

            }
        })
    }
}