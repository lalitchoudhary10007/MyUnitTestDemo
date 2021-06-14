package com.lalit.myunittestdemo.unittests

import com.lalit.myunittestdemo.outside_in_tdd.Car
import com.lalit.myunittestdemo.outside_in_tdd.Engine
import com.lalit.myunittestdemo.utils.MainCoroutineScopeRule
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CarShould {

    private val engine : Engine = mock(Engine::class.java)
    private val car = Car(5.0, engine)

    @get:Rule
    val coroutineRule = MainCoroutineScopeRule()

//    @Before
//    fun onSetup(){
//        car = Car(5.0, engine)
//    }


    @Test
    fun loosFuelWhenItTurnsOn() = runBlockingTest{
        car.turnOn()
        assertEquals(4.5, car.fuel)
    }

    @Test
    fun turnOnItsEngine() = runBlockingTest{
        car.turnOn()
        coroutineRule.advanceTimeBy(7000)
       // verify(engine, times(1)).turnOn()
    }

}