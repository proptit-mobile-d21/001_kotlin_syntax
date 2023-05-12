import kotlin.math.abs
import kotlin.random.Random

fun draw(n: Int) {
    for (i in 0..n - 1) {
        for (j in (-n + 1)..(n - 1)) {
            if (i == abs(j) || i == n - 1)
                print("*")
            else
                print(" ")
        }
        println()
    }
}

fun main() {
    val n = Random.nextInt(3, 8)
    draw(n)
}