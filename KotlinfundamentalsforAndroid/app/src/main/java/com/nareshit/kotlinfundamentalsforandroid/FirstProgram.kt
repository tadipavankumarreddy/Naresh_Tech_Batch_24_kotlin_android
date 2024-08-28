package com.nareshit.kotlinfundamentalsforandroid

import java.util.Scanner

fun main(){
    println("Choose your option: \n1. Square\n2.Twice\n3.Half")
    val s:Scanner = Scanner(System.`in`)
    val option = s.nextInt()
    println("Enter a number")
    val a = s.nextInt()
    /*when(option){
        1 -> println(a*a)
        2 -> println(2*a)
        3 -> println(a/2)
        else -> println("Wrong Option")
    }*/

    val result =  when(option){
        1 -> a*a
        2 -> 2*a
        3 -> a/2
        else -> 0
    }

    if(result!=0) println(result) else println("Wrong Option")
}