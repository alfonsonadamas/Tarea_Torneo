package com.example.tap_u4t1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnBulls = findViewById<Button>(R.id.btnBulls)
        val checkBulls = findViewById<CheckBox>(R.id.checkBulls)
        val btnLakers = findViewById<Button>(R.id.btnLakers)
        val checkLakers = findViewById<CheckBox>(R.id.checkLakers)
        val btnSpurs = findViewById<Button>(R.id.btnSpurs)
        val checkSpurs = findViewById<CheckBox>(R.id.checkSpurs)
        val btnRockets = findViewById<Button>(R.id.btnRockets)
        val checkRockets = findViewById<CheckBox>(R.id.checkRockets)
        val btnWarriors = findViewById<Button>(R.id.btnGS)
        val checkWarriors = findViewById<CheckBox>(R.id.checkWarrior)
        val btnRaptors = findViewById<Button>(R.id.btnRaptors)
        val checkRaptors = findViewById<CheckBox>(R.id.checkRaptors)
        val btnHeat = findViewById<Button>(R.id.btnHeat)
        val checkHeat = findViewById<CheckBox>(R.id.checkHeat)
        val btnBucks= findViewById<Button>(R.id.btnBucks)
        val checkBucks = findViewById<CheckBox>(R.id.checkBucks)
        val btnContinuar = findViewById<Button>(R.id.btnContinuar)


        btnBulls.setOnClickListener {
            checkBulls.isChecked = true
        }

        btnLakers.setOnClickListener {
            checkLakers.isChecked = true
        }

        btnSpurs.setOnClickListener {
            checkSpurs.isChecked = true
        }

        btnRockets.setOnClickListener {
            checkRockets.isChecked = true
        }

        btnWarriors.setOnClickListener {
            checkWarriors.isChecked = true
        }

        btnRaptors.setOnClickListener {
            checkRaptors.isChecked = true
        }

        btnHeat.setOnClickListener {
            checkHeat.isChecked = true
        }

        btnBucks.setOnClickListener {
            checkBucks.isChecked = true
        }

        btnContinuar.setOnClickListener{
            val intent = Intent(this, CuartosActivity::class.java)

            if(checkBulls.isChecked){
                intent.putExtra("Bulls", true)
            }

            if(checkLakers.isChecked){
                intent.putExtra("Lakers", true)
            }

            if(checkSpurs.isChecked){
                intent.putExtra("Spurs", true)
            }

            if(checkRockets.isChecked){
                intent.putExtra("Rockets", true)
            }

            if(checkWarriors.isChecked){
                intent.putExtra("Warriors", true)
            }

            if(checkRaptors.isChecked){
                intent.putExtra("Raptors", true)
            }
            if(checkHeat.isChecked){
                intent.putExtra("Heat", true)
            }

            if(checkBucks.isChecked){
                intent.putExtra("Bucks", true)
            }

            startActivity(intent)

        }
    }
}