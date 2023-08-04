package com.example.plof

import android.os.Bundle
//import androidx.support.v7.app.AppCompatActivity
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.plof.R
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    var onl: Button? = null
    var offl: Button? = null
    var onb: Button? = null
    var offb: Button? = null
    var ons: Button? = null
    var offs: Button? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onl = findViewById(R.id.button_on)
        offl = findViewById(R.id.button_off)
        onl!!.setOnClickListener { // Write a message to the database
            val database: FirebaseDatabase = FirebaseDatabase.getInstance()
            val myRef: DatabaseReference =
                database.getReference("LED_STATUS") //LED_STATUS is Firebase database LED_STATUS
            myRef.setValue("ON")
        }
        offl!!.setOnClickListener {
            val database: FirebaseDatabase = FirebaseDatabase.getInstance()
            val myRef: DatabaseReference =
                database.getReference("LED_STATUS") //LED_STATUS is Firebase database LED_STATUS
            myRef.setValue("OFF")

        onb = findViewById(R.id.button_on_b)
        offb = findViewById(R.id.button_off_b)
        onb!!.setOnClickListener { // Write a message to the database
            val database: FirebaseDatabase = FirebaseDatabase.getInstance()
            val myRef: DatabaseReference =
                database.getReference("BUZZER_STATUS")
            myRef.setValue("ON")
            }
        offb!!.setOnClickListener {
            val database: FirebaseDatabase = FirebaseDatabase.getInstance()
            val myRef: DatabaseReference =
                database.getReference("BUZZER_STATUS") //LED_STATUS is Firebase database LED_STATUS
            myRef.setValue("OFF")
            }

        ons = findViewById(R.id.button_on_s)
        offs = findViewById(R.id.button_off_s)
        ons!!.setOnClickListener { // Write a message to the database
            val database: FirebaseDatabase = FirebaseDatabase.getInstance()
            val myRef: DatabaseReference =
                database.getReference("SERVO_STATUS")
            myRef.setValue("ON")
            }
            offs!!.setOnClickListener {
                val database: FirebaseDatabase = FirebaseDatabase.getInstance()
                val myRef: DatabaseReference =
                    database.getReference("SERVO_STATUS") //LED_STATUS is Firebase database LED_STATUS
                myRef.setValue("OFF")
            }


        }
    }
}