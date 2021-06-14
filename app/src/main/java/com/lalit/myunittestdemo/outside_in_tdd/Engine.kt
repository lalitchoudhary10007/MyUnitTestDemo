package com.lalit.myunittestdemo.outside_in_tdd

import kotlinx.coroutines.delay

class Engine(var isTurnedOn: Boolean = false, var temperature: Int = 15) {

    suspend fun turnOn() {
        isTurnedOn = true
        delay(6000)
        temperature = 95
    }


}