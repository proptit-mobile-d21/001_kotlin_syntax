import kotlin.random.Random

const val maxValue = 10000
val list = mutableListOf<Int>()

fun gen(start: Int = 1, end: Int = maxValue): Int {
    return Random.nextInt(start, end)
}

fun findMaxNumber(number: Int): Int {
    var ans = Int.MIN_VALUE
    for (i in list)
        if (i < number) ans = Math.max(ans, i)
    if (ans == Int.MIN_VALUE) return -1
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