import kotlin.math.sqrt
import kotlin.random.Random

const val maxValue = 10000

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}

fun check(number2 :Int) :Int {
    for (i in 2..sqrt(number2.toDouble()).toInt())
    {
        if (number2 % i == 0) return 0
    }
    return 1
}
fun findNextPrime(number : Int) : Int {
    var num: Int = number
    while(check(num) == 0)
    {
        num++
    }
    return num
}

fun main() {
    val n = gen(1, 10)
    repeat(n) {
        println(findNextPrime(gen()))
    }
}