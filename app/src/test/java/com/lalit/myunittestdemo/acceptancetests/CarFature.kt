package com.lalit.myunittestdemo.acceptancetests

import com.lalit.myunittestdemo.outside_in_tdd.Car
import com.lalit.myunittestdemo.outside_in_tdd.Engine
import com.lalit.myunittestdemo.utils.MainCoroutineScopeRule
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test

class CarFature {

    private val engine = Engine()
    private val car = Car(6.0, engine)

    @get:Rule
    val coroutineRule = MainCoroutineScopeRule()


    @Test
    fun carIsLoosingFuelWhenTurnsOn(){
        car.turnOn()
        coroutineRule.advanceTimeBy(7000)
        assertEquals(5.5, car.fuel)
    }

    @Test
    fun carIsTurningOnItsEngineIncreaseTheTemperature() = runBlockingTest{
        car.turnOn()
        coroutineRule.advanceTimeBy(7000)
        assertEquals(95, car.engine.temperature)
        assertEquals(true, car.engine.isTurnedOn)
    }

}