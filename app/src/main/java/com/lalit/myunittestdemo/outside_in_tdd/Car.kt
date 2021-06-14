package com.lalit.myunittestdemo.outside_in_tdd

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Car(var fuel: Double, public val engine: Engine) {

    fun turnOn(){
       fuel-= 0.5
        CoroutineScope(Dispatchers.Main).launch {
            engine.turnOn()
        }
    }

}