import kotlin.random.Random

const val maxValue = 10000
val list = mutableListOf<Int>()

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}

fun findMaxNumber(number : Int) : Int {
    var num: Int = -1
    for (i in 0..list.size-1)
    {
        if(list.get(i) < number)
        {
            if(list.get(i) > num) num = list.get(i)
        }
    }
    return num
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