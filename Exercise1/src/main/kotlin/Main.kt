import kotlin.random.Random

fun draw(n : Int){
    for(i in 1..n){
        for(j in 1..n+i-1)
            if (i+j-1==n||j-i+1==n||i==n) print("*")
            else print(" ")
        print("\n")
    }
}

fun main() {
    val n = Random.nextInt(3, 8)
    draw(n)
}