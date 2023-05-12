package com.example.kotlintest

import kotlin.random.Random

const val maxValue = 20102003

fun gen2(start : Int = 1, end : Int = 2003) : Int {
    return Random.nextInt(start, end)
}
val primes = BooleanArray(maxValue+2) { true }

fun eratosthenes() {
    var i = 2
    primes[0]=false
    primes[1]=false
    while (i * i <= maxValue) {
        if (primes[i]) {
            var j = i * i
            while (j <= maxValue) {
                primes[j] = false
                j += i
            }
        }
        i++
    }
}
fun findNextPrime(number : Int): Int {
    for(x in number..maxValue step 1){
        if(primes[x]){
            return x
        }
    }
    return -1
}

fun main() {
    eratosthenes()
    val n = gen2()
    println(n)
    println(findNextPrime(n))
}