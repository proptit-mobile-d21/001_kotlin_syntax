import kotlin.math.sqrt
import kotlin.random.Random

const val maxValue = 10000

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}

var primes = buildList<Int> {
    val n = maxValue + 17
    val isPrimes = MutableList(n+3, {true})
    val lim = sqrt(n.toDouble()).toInt()
    for (i in 2..lim) {
        if (isPrimes[i]) {
            for (j in i*2..lim step i) isPrimes[i] = false
        }
    }
    for (i in isPrimes.indices) if (i >= 2 && isPrimes[i]) add(i)
}

fun findNextPrime(number : Int) : Int {
    for (prime in primes) {
        if (prime >= number) return prime
    }
    return -1
}

fun main() {
    val n = gen(1, 100)
    repeat(n) {
        println(findNextPrime(gen()))
    }
}