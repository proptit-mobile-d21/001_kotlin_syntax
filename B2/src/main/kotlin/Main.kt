import kotlin.math.sqrt
import kotlin.random.Random

const val maxValue = 10000

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}

fun isPrime(n : Int) : Boolean {
    if(n == 0 || n == 1) return false
    for(i in 2..sqrt(n.toDouble()).toInt()){
        if(n%i==0) return false
    }
    return true
}

fun findNextPrime(number : Int) : Int {
    var tmp = number
    while (true){
        if(isPrime(tmp)) return tmp
        ++tmp
    }
}

fun main() {
    val n = gen(1, 100)
    repeat(n) {
        println(findNextPrime(gen()))
    }
}