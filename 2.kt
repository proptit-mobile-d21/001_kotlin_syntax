import kotlin.random.Random
import kotlin.math.*
const val maxValue = 10000

var save = mutableListOf<Int>()

fun sieve(){
    var mark = mutableListOf<Int>()
    for(i in 1..maxValue+6){
        mark.add(0)
    }
    
    for(i in 2..100){
        if(mark[i] == 0){
           	for(j in i*i..maxValue step i){
            	mark[j] = 1;
        	} 
        }
    }
    
    for(i in 2..maxValue){
        if(mark[i] == 0){
        	save.add(i)    
        }
    }
    
}

fun gen(start : Int = 1, end : Int = maxValue) : Int {
    return Random.nextInt(start, end)
}

fun findNextPrime(number : Int) : Int {
    for(i in save){
        if(i >= number){
            return i
        }
    }
    return 0
}

fun main() {
    sieve()
    
//     for(i in save.indices){
//         println(save[i])
//     }

    val n = gen(1, 100)
    println(n)
    repeat(n) {
//         val m = gen()
//         println("m = " + m)
//         println(findNextPrime(m))
        println(findNextPrime(gen()))
    }
}