package com.nareshit.kotlinfundamentalsforandroid

import java.util.Scanner

fun main() {
    println("Enter the size of the array")
    val s = Scanner(System.`in`)
    val l = s.nextInt()

    var a = Array<Int>(l,{i->i+1})
    for (i in a){
        print("$i ")
    }
}