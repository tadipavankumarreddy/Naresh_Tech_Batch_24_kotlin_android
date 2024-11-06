package com.nareshtech.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Coroutine runs on ${Thread.currentThread().name}")
        GlobalScope.launch {
            println("Coroutine runs on ${Thread.currentThread().name}")
            delay(1000)
        }

        delayForSometime(2000)
        println("Coroutine runs on ${Thread.currentThread().name}")
    }
}

suspend fun delayForSometime(i:Long){
    delay(i)
}