import kotlin.math.sqrt
import kotlin.random.Random

const val maxValue = 10000

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}
fun checkPrime(number : Int) : Boolean {
    if(number < 2)
        return false
    for(i in 2..sqrt(number.toDouble()).toInt()) {
        if(number % i == 0)
            return false
    }
    return true
}
fun findNextPrime(number : Int) : Int {
    while(!checkPrime(number)) {
        return findNextPrime(number + 1)
    }
    return number
}

fun main() {
    val n = gen(1, 100)
    repeat(n) {
        println(findNextPrime(gen()))
    }
}