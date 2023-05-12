package com.example.kotlintest

import kotlin.random.Random

fun draw(n : Int){
    println("n = $n")
    for(x in 1..n step 1){
        for(i in 1..n-x)print(" ")
        for(i in 1 until 2*x)print("*")
        println()
    }
}

fun main() {
    val n = Random.nextInt(3, 8)
    draw(n)
}