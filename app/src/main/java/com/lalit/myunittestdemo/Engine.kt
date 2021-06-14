package com.lalit.myunittestdemo

class Engine(val cc: Int, val hp: Int, var temp: Int, var isTurnedOn: Boolean) {

    fun turnOn(){
        isTurnedOn = true
        temp = 95
    }

    fun turnOff() {
        isTurnedOn = false
        temp = 15
    }

}