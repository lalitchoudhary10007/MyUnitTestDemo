package com.lalit.myunittestdemo.acceptancetests

import com.lalit.myunittestdemo.outside_in_tdd.Car
import com.lalit.myunittestdemo.outside_in_tdd.Engine
import junit.framework.TestCase.assertEquals
import org.junit.Test

class CarFature {

    private val engine = Engine()
    private val car = Car(6.0, engine)

    @Test
    fun carIsLoosingFuelWhenTurnsOn(){

        car.turnOn()
        assertEquals(5.5, car.fuel)

    }

    @Test
    fun carIsTurningOnItsEngineIncreaseTheTemperature(){
        car.turnOn()
        assertEquals(95, car.engine.temperature)
        assertEquals(true, car.engine.isTurnedOn)
    }

}