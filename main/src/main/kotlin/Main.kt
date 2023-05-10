import kotlin.random.Random

fun draw(n : Int){
    for(i in 1 until  n){
        for(j in 1..2 * n) {
            if(j == n - i + 1 || j == n + i - 1) print('X')
            else print(' ')
        }
        println()
    }
    for(i in 1..2 * n - 1){
        print('X')
    }
}

fun main() {
    var n = Random.nextInt(3, 8)
    n = 4
    draw(n)
}