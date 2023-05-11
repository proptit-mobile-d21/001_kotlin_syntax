import kotlin.random.Random

const val maxValue = 10000
val list = mutableListOf<Int>()

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}

fun findMaxNumber(number : Int) : Int {
    list.sortDescending()
    for(i in list)
    {
        if(i<number)
        {
            return i
        }
    }
    return 0
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