package com.example.kotlintest

import kotlin.random.Random

fun getValue() : Int{
    return Random.nextInt(2, 5)
}
//Lỗi do getValue luôn trả về giá trị null và khai báo ban đầu n = null
fun gen(n : Int, s : String) {
    if(n == 0){
        println(s)
        return
    }
    gen(n - 1, s + "0")
    gen(n - 1, s + "1")
}

fun main() {
    var n: Int = getValue()
    gen(n, "")
}