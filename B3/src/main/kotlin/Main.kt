import kotlin.random.Random

const val maxValue = 10000
val list = mutableListOf<Int>()

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}

fun findMaxNumber(number : Int) : Int {
    var res = list.get(0)
    for(x in list){
        if(x < number && x > res) res = x
    }
    return res
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