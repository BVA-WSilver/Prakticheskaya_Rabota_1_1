package com.example.prakticheskaya_rabota_1_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var MyViwe = findViewById<TextView>(R.id.View_Text)
        val V: Int                 //Объём параллелепипеда
        val a = 5
        val b = 7
        val c = 4
        V = a * b * c              //Формула расчета объема параллелепипеда
        MyViwe.text = V.toString() //Вывод на Экран
    }
}