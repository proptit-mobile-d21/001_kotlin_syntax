import kotlin.math.sqrt
import kotlin.random.Random

const val maxValue = 10000

fun gen(start: Int = 1, end: Int = maxValue): Int {
    return Random.nextInt(start, end)
}

fun checkPrime(n: Int): Boolean {
    if (n < 2)
        return false
    var i: Int = 2
    while (i * i <= n) {
        if (n % i == 0)
            return false
        ++i
    }
    return true
}

fun findNextPrime(number: Int): Int {
    while (!checkPrime(number))
        return (findNextPrime(number + 1))
    return number
}

fun main() {
    val n = gen(1, 100)
    repeat(n) {
        println(findNextPrime(gen()))
    }
}