import kotlin.random.Random

const val maxValue = 10000

fun gen(start: Int = 1, end: Int = maxValue): Int {
    return Random.nextInt(start, end)
}

fun nto(n: Int): Boolean {
    for (i in 2..Math.sqrt(n.toDouble()).toInt())
        if (n % i == 0) return false
    return n > 1
}

fun findNextPrime(number: Int): Int {
    var n = number - 1
    while (!nto(n)) n--
    return n
}

fun main() {
    val n = gen(1, 100)
    repeat(n) {
        println(findNextPrime(gen()))
    }
}