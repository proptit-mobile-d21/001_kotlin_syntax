import kotlin.random.Random

fun draw(n : Int){
    println("n = $n")
    for(i in 0..n-2) {
        for(j in -n+1..n-1) print(if (j == i || -j == i) "*" else " ")
        print("\n")
    }
    for(i in -n+1..n-1) print("*")
}

fun main() {
    val n = Random.nextInt(3, 8)
    draw(n)
}