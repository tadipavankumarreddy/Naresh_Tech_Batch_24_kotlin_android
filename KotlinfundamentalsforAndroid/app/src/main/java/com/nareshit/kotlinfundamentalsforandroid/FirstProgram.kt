package com.nareshit.kotlinfundamentalsforandroid

import java.util.Scanner

class Dog(var name:String?, var age:Int?, var weight:Double?){

    fun display(){
        println("$name of age $age is of weight $weight")
    }
}

fun main(){
    val d = Dog("Justin",12,5.6) // This is how you create an Object
    d.display()

    val j = d
    println(d.equals(Dog("Justin",12,5.6)))
    println(d.equals(j))

    println(d.toString())

    println(j.hashCode())
    println(d.hashCode())
}