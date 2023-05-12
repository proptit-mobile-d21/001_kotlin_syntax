import kotlin.random.Random


class Bai3 {
    val list = mutableListOf<Int>()

    fun gen(start : Int = 1, end : Int = maxValue) : Int {
        return Random.nextInt(start, end)
    }

    fun findMaxNumber(number : Int) : Int {
        // code
        var resp = list.sortedDescending()
        for(i in resp){
            if( i < number)
                return i
        }
        return 0
    }

}