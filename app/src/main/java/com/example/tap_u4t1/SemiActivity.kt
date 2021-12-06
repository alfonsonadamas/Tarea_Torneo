package com.example.tap_u4t1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class SemiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semi)

        val bulls = intent.getBooleanExtra("bulls", false)
        val lakers = intent.getBooleanExtra("lakers",false)
        val spurs = intent.getBooleanExtra("spurs",false)
        val rockets = intent.getBooleanExtra("rockets",false)
        val warriors = intent.getBooleanExtra("warriors",false)
        val raptors = intent.getBooleanExtra("raptors",false)
        val heat = intent.getBooleanExtra("heat",false)
        val bucks = intent.getBooleanExtra("bucks",false)

        val text1 = findViewById<TextView>(R.id.textFinal1)
        val text2 = findViewById<TextView>(R.id.textFinal2)
        val sel1 = findViewById<Button>(R.id.btnFinal1)
        val sel2 = findViewById<Button>(R.id.btnFinal2)
        val chec1 = findViewById<CheckBox>(R.id.checkFinal1)
        val chec2 = findViewById<CheckBox>(R.id.checkFinal2)
        val continuar = findViewById<Button>(R.id.btnContinuar)

        println(rockets)

        if(bulls === true){
            text1.setText("Chicago Bulls")

        }
        if(lakers === true){
            text1.setText("LA Lakers")

        }
        if(spurs === true){
            text1.setText("SA Spurs")

        }
        if(rockets === true){
            text1.setText("Houston Rockets")

        }

        if(warriors === true){
            text2.setText("Golden St Warriors")

        }
        if(raptors === true){
            text2.setText("Toronto Raptors")

        }
        if(heat === true){
            text2.setText("Miami Heat")

        }
        if(bucks === true){
            text2.setText("Milwaukee Bucks")

        }

        sel1.setOnClickListener {
            chec1.isChecked = true
        }

        sel2.setOnClickListener {
            chec2.isChecked = true
        }

        val textFinal1 = text1.text
        val textFinal2 = text2.text

        continuar.setOnClickListener{
            val intent = Intent(this, FinalActivity::class.java)
            if(textFinal1 === "Chicago Bulls" && chec1.isChecked){
                intent.putExtra("bulls", true)
            }else if(textFinal1 === "LA Lakers" && chec1.isChecked){
                intent.putExtra("lakers", true)
            }

            if(textFinal1 === "SA Spurs" && chec1.isChecked){
                intent.putExtra("spurs", true)
            }else if(textFinal1 === "Houston Rockets" && chec1.isChecked){
                intent.putExtra("rockets", true)
            }

            if(textFinal2 === "Golden St Warriors" && chec2.isChecked){
                intent.putExtra("warriors", true)
            }else if(textFinal2 === "Toronto Raptors" && chec2.isChecked){
                intent.putExtra("raptors", true)
            }

            if(textFinal2 === "Miami Heat" && chec2.isChecked){
                intent.putExtra("heat", true)
            }else if(textFinal2 === "Milwaukee Bucks"&& chec2.isChecked){
                intent.putExtra("bucks", true)
            }

            startActivity(intent)
        }



    }


}