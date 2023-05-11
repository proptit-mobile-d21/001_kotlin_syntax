import kotlin.random.Random

const val maxValue = 10000

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}
val prime = mutableListOf<Int>()
fun seive()
{
    val d = mutableListOf<Int>()
    for(i in 1..maxValue+6){
        d.add(0)
    }

    for(i in 2..100){
        if(d[i] == 0){
            for(j in i*i..maxValue step i){
                d[j] = 1;
            }
        }
    }

    for(i in 2..maxValue){
        if(d[i] == 0){
            prime.add(i)
        }
    }
}

fun findNextPrime(number : Int) : Int {
    for(i in prime)
    {
        if(i>number)
        {
            return i
        }
    }
    return 0
}

fun main() {
    val n = gen(1, 100)
    seive()
    repeat(n) {
        println(findNextPrime(gen()))
    }
}