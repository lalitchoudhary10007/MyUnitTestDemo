package com.lalit.myunittestdemo.unittests

import com.lalit.myunittestdemo.outside_in_tdd.Car
import com.lalit.myunittestdemo.outside_in_tdd.Engine
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CarShould {

    @Mock
    lateinit var engine : Engine


    private lateinit var car : Car

    @Before
    fun onSetup(){
        car = Car(5.0, engine)
    }


    @Test
    fun loosFuelWhenItTurnsOn(){
        car.turnOn()
        assertEquals(4.5, car.fuel)
    }

    @Test
    fun turnOnItsEngine(){
        car.turnOn()
        verify(engine, times(1)).turnOn()
    }

}