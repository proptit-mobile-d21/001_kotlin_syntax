import kotlin.random.Random

const val maxValue = 10000
const val N = 100000
var check = BooleanArray(N+1)
class Bai2 {
    fun gen(start : Int = 1, end : Int = maxValue) : Int {
        return Random.nextInt(start, end)
    }
    fun checkPrime():Unit {
        for(i in 2..N) check[i] = true
        for(i in 2..N){
            if(check[i]){
                for(j in 2*i..10 step i){
                    check[j] = false

                }
            }
        }
    }
    fun findNextPrime(number : Int) : Int {
        // code
        if(number < 2) return 2
        for(i in number..N){
            if(check[i])
                return i
        }
        return 0
    }
}