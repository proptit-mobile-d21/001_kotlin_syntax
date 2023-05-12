import kotlin.math.max
import kotlin.random.Random

const val maxValue = 10000
val list = mutableListOf<Int>()

fun gen(start: Int = 1, end: Int = maxValue): Int {
    return Random.nextInt(start, end)
}

fun findMaxNumber(number: Int): Int {
    var ans: Int = -1
    for (i in list) {
        if (i < number) {
            ans = max(ans, i)
        }
    }
    return ans
}

fun main() {
    val n = gen(1, 100)
    repeat(n) {
        list.add(gen())
    }
    repeat(n) {
        println(findMaxNumber(gen()))
    }
}