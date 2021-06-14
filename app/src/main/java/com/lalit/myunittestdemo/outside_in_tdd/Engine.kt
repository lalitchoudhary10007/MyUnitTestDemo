package com.lalit.myunittestdemo.outside_in_tdd

class Engine (var isTurnedOn: Boolean = false, var temperature: Int = 15){

    fun turnOn() {
       isTurnedOn = true
        temperature = 95
    }


}