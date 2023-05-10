import kotlin.random.Random

fun draw(n : Int){
    for(x in 1..n - 1){
        for(y in 1..n*2-1){
            if(y == n - x + 1 || y == n + x - 1){
                print("*")
            }else print(" ")
        }
        println()
    }
    for(x in 1..n*2-1) print('*')

}

fun main() {
    val n = Random.nextInt(3, 8)
    draw(n)
}