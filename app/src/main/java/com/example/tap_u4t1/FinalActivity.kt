package com.example.tap_u4t1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val bulls = intent.getBooleanExtra("bulls", false)
        val lakers = intent.getBooleanExtra("lakers",false)
        val spurs = intent.getBooleanExtra("spurs",false)
        val rockets = intent.getBooleanExtra("rockets",false)
        val warriors = intent.getBooleanExtra("warriors",false)
        val raptors = intent.getBooleanExtra("raptors",false)
        val heat = intent.getBooleanExtra("heat",false)
        val bucks = intent.getBooleanExtra("bucks",false)

        val final = findViewById<TextView>(R.id.textFinal)

        if(bulls === true){
            final.setText("Chicago Bulls")

        }
        if(lakers === true){
            final.setText("LA Lakers")

        }
        if(spurs === true){
            final.setText("SA Spurs")

        }
        if(rockets === true){
            final.setText("Houston Rockets")

        }

        if(warriors === true){
            final.setText("Golden St Warriors")

        }
        if(raptors === true){
            final.setText("Toronto Raptors")

        }
        if(heat === true){
            final.setText("Miami Heat")

        }
        if(bucks === true){
            final.setText("Milwaukee Bucks")

        }
    }
}