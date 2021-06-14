package com.lalit.myunittestdemo.outside_in_tdd

class Car(var fuel: Double, public val engine: Engine) {


    fun turnOn(){
       fuel-= 0.5
       engine.turnOn()
    }

}