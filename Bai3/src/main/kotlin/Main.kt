import kotlin.random.Random

const val maxValue = 10000
val list = mutableListOf<Int>()

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}

fun findMaxNumber(number : Int) : Int {
    println("So lon nhat nho hon $number: ")
    var arrays = list.sorted()
    var left : Int = 0
    var right : Int = list.size - 1
    var idx : Int = list.size
    while(left <= right){
        var mid : Int = (left + right) / 2
        if(arrays[mid] >= number){
            right = mid - 1
            idx = mid
        }
        else{
            left = mid + 1
        }
    }
    if(idx == 0){
        return -1
    }
    else{
        return arrays[idx - 1]
    }
}

fun main() {
    var n = gen(1, 100)
    repeat(n) {
        list.add(gen())
    }
    println(list)
    repeat(n) {
       println(findMaxNumber(gen()))
    }
}