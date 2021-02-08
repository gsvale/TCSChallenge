package com.example.tcschallenge

import java.util.*
import kotlin.math.sqrt

class MathCourse {


    fun returnPrimeNumber(value : Int): Boolean {

        var isPrime = true

        for (i in 2 until value) {
            if(value % i == 0){
                isPrime = false
                break
            }
        }
        return isPrime
    }

    fun returnFibonacciNumber(value: Int) : String{

        var previousNumber = 0
        var nextNumber = 1
        val result: StringBuilder = StringBuilder()

        for (i in 1 until value) {

            result.append(previousNumber)
            result.append(" ")

            val sum = previousNumber + nextNumber
            previousNumber = nextNumber
            nextNumber = sum
        }

        return result.toString()

    }

    fun returnArraySort(array: IntArray) : String{
        Arrays.sort(array)
        return array.contentToString()
    }

    fun returnSquareRoot(value : String): String {
        var returnValue = ""

        return try {
            val number : Int = Integer.parseInt(value)
            returnValue = sqrt(number.toDouble()).toString()
            returnValue
        } catch(e: Exception){
            returnValue = e.toString()
            returnValue
        }
    }



}