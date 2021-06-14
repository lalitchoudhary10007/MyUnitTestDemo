package com.lalit.myunittestdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lalit.myunittestdemo.outside_in_tdd.Car
import com.lalit.myunittestdemo.outside_in_tdd.Engine

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val engine = Engine()
        val car = Car(20.00, engine)
        car.turnOn()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}