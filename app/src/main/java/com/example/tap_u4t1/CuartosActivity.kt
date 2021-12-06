package com.example.tap_u4t1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class CuartosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuartos)

        val bulls = intent.getBooleanExtra("Bulls", false)
        val lakers = intent.getBooleanExtra("Lakers",false)
        val spurs = intent.getBooleanExtra("Spurs",false)
        val rockets = intent.getBooleanExtra("Rockets",false)
        val warriors = intent.getBooleanExtra("Warriors",false)
        val raptors = intent.getBooleanExtra("Raptors",false)
        val heat = intent.getBooleanExtra("Heat",false)
        val bucks = intent.getBooleanExtra("Bucks",false)


        val text1 = findViewById<TextView>(R.id.textSemi1)
        val text2 = findViewById<TextView>(R.id.textSemi2)
        val text3 = findViewById<TextView>(R.id.textSemi3)
        val text4 = findViewById<TextView>(R.id.textSemi4)
        val sel1 = findViewById<Button>(R.id.btnSemi1)
        val chec1 = findViewById<CheckBox>(R.id.checkSemi1)
        val sel2 = findViewById<Button>(R.id.btnSemi2)
        val chec2 = findViewById<CheckBox>(R.id.checkSemi2)
        val sel3 = findViewById<Button>(R.id.btnSemi3)
        val chec3 = findViewById<CheckBox>(R.id.checkSemi3)
        val sel4 = findViewById<Button>(R.id.btnSemi4)
        val chec4 = findViewById<CheckBox>(R.id.checkSemi4)
        val continuar = findViewById<TextView>(R.id.btnContinuar)


        if(bulls === true){
            text1.setText("Chicago Bulls")

        }
        if(lakers === true){
            text1.setText("LA Lakers")

        }
        if(spurs === true){
            text2.setText("SA Spurs")

        }
        if(rockets === true){
            text2.setText("Houston Rockets")

        }
        if(warriors === true){
            text3.setText("Golden St Warriors")

        }
        if(raptors === true){
            text3.setText("Toronto Raptors")

        }
        if(heat === true){
            text4.setText("Miami Heat")

        }
        if(bucks === true){
            text4.setText("Milwaukee Bucks")

        }

        sel1.setOnClickListener {
            chec1.isChecked = true
        }

        sel2.setOnClickListener {
            chec2.isChecked = true
        }

        sel3.setOnClickListener {
            chec3.isChecked = true
        }

        sel4.setOnClickListener {
            chec4.isChecked = true
        }

        val textsemi1 = text1.text
        val textsemi2 = text2.text
        val textsemi3 = text3.text
        val textsemi4 = text4.text

        continuar.setOnClickListener {
            val intent = Intent(this, SemiActivity::class.java)
            if(textsemi1 === "Chicago Bulls" && chec1.isChecked){
                intent.putExtra("bulls", true)
            }else if(textsemi1 === "LA Lakers" && chec1.isChecked){
                intent.putExtra("lakers", true)
            }

            if(textsemi2 === "SA Spurs" && chec2.isChecked){
                intent.putExtra("spurs", true)
            }else if(textsemi2 === "Houston Rockets" && chec2.isChecked){
                intent.putExtra("rockets", true)
            }

            if(textsemi3 === "Golden St Warriors" && chec3.isChecked){
                intent.putExtra("warriors", true)
            }else if(textsemi3 === "Toronto Raptors" && chec3.isChecked){
                intent.putExtra("raptors", true)
            }

            if(textsemi4 === "Miami Heat" && chec4.isChecked){
                intent.putExtra("heat", true)
            }else if(textsemi4 === "Milwaukee Bucks"&& chec4.isChecked){
                intent.putExtra("bucks", true)
            }

            startActivity(intent)
        }


    }
}