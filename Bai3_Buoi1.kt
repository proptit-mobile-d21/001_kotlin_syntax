package com.example.kotlintest

import kotlin.random.Random

const val maxValue3 = 10000
val list = mutableListOf<Int>()

fun gen3(start : Int = 1, end : Int = maxValue3) : Int {
    return Random.nextInt(start, end)
}

fun findMaxNumber(number : Int) : Int {
    var ans: Int = -1
    for(num in list){
        if(num<number){
            ans=num
            break
        }
    }
    if(ans==-1) return -1
    for(num in list){
        if(num in (ans + 1) until number){
            ans=num
        }
    }
    return ans
}

fun main() {
    val n = gen3(1, 100)
    var tmp: Int
    repeat(n) {
        tmp = gen3()
        list.add(tmp)
        print(" $tmp")
    }
    println()
    tmp=gen3()
    println(tmp)
    println(findMaxNumber(tmp))
}