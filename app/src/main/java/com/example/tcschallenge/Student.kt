package com.example.tcschallenge

import android.util.Log
import java.util.*

import kotlin.collections.ArrayList

class Student {


    init{

        // Print all methods

        println(MathCourse().returnPrimeNumber(7))
        println(MathCourse().returnFibonacciNumber(10))
        println(MathCourse().returnArraySort(intArrayOf(50, 40, 30, 20, 10)))
        println(MathCourse().returnSquareRoot("9"))

        println(EnglishCourse().returnVowels("android"))
        println(EnglishCourse().returnIfPalindrome("android"))
        println(EnglishCourse().returnSubString("android", 5))

        val employees : List<StatisticsCourse.Employee> = ArrayList()
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Joao", 0, 34, 800.00, "Engineering", Date(1987, 12, 20)))
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Joana", 1, 28, 700.00, "Marketing", Date(2018, 4, 2)))
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Manel", 2, 40, 600.00, "Engineering", Date(2018, 4, 9)))
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Filipa", 3, 50, 500.00, "Mechanics", Date(2018, 12, 20)))
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Verónica", 4, 35, 1000.00, "Engineering", Date(2015, 8, 14)))
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Maria", 5, 22, 1200.00, "Mechanics", Date(2018, 9, 25)))
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Lara", 6, 29, 1500.00, "Technology", Date(2017, 2, 20)))
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Paula", 7, 32, 750.00, "Technology", Date(2018, 4, 20)))
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Filipe", 8, 39, 950.00, "Marketing", Date(1997, 7, 7)))
        (employees as ArrayList<StatisticsCourse.Employee>).add(
            StatisticsCourse.Employee("Paulo", 9, 49, 975.00, "Marketing", Date(1999, 7, 20)))

        println(StatisticsCourse(employees).returnEmployeesMap())
        println(StatisticsCourse(employees).returnSetEmployeesWithBetween30and40years())
        println(StatisticsCourse(employees).returnListOfWhoJoinedAfter1April2018())

    }

}