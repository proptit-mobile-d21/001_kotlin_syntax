import kotlin.random.Random

fun main() {
    //bai1
//    val n = Random.nextInt(3, 8)
//    println(n)
//    val triangle = Bai1()
//    triangle.draw(n)

    //bai2
//    val nextPrime = Bai2()
//    val n = nextPrime.gen(1, 100)
//    nextPrime.checkPrime()
//    repeat(n) {
//        println(nextPrime.findNextPrime(nextPrime.gen()))
//    }

    //bai3
//    val maxNumber = Bai3()
//    val n = maxNumber.gen(1, 100)
//    repeat(n) {
//        maxNumber.list.add(maxNumber.gen())
//    }
//    repeat(n) {
//        println(maxNumber.findMaxNumber(maxNumber.gen()))
//    }

    //Bai4
    val err = Bai4()
    var n: Int? = null
    n = err.getValue()
    if(n != null)
    err.gen(n, "")

}