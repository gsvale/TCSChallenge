package com.example.tcschallenge

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class StatisticsCourse(employees: List<Employee>) {

    private val employees : List<Employee> = ArrayList()

    class Employee(
         val name: String,
         val id: Int,
         val age: Int,
         val salary: Double,
         val dept: String,
         val dateOfJoining: Date
     ){

        override fun toString(): String {
            return "Employee(name='$name')"
        }

    }

    init {
        (this.employees as ArrayList<Employee>).addAll(employees)
    }


    fun returnEmployeesMap() : Map<Int, String>{
        val map : Map<Int, String> = hashMapOf()

        for(employee in employees){
            (map as HashMap)[employee.id] = employee.name
        }

        return map
    }

    fun returnSetEmployeesWithBetween30and40years() : Set<Employee>{
        val set : Set<Employee> = hashSetOf()

        for(employee in employees){
            if(employee.age in 31..39){
                (set as HashSet).add(employee)
            }
        }

        return set
    }

    fun returnListOfWhoJoinedAfter1April2018() : List<Employee>{

        val listEmployees : List<Employee> = ArrayList()
        val listEmployeesOfWhoJoinedAfter1April2018 : List<Employee> = ArrayList()

        (listEmployees as ArrayList<Employee>).addAll(employees)

        Collections.sort(listEmployees) { obj1, obj2 ->
            obj1.name.compareTo(obj2.name, true)
        }

        val date1April2018 : Date =  Date(2018,4,1)

        for(employee in listEmployees){
            if(employee.dateOfJoining.after(date1April2018)){
                (listEmployeesOfWhoJoinedAfter1April2018 as ArrayList<Employee>).add(employee)
            }
        }


        return listEmployeesOfWhoJoinedAfter1April2018
    }



}