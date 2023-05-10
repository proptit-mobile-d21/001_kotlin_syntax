import java.lang.Math.abs
import kotlin.random.Random

fun draw(n : Int){
    for(i in 1..n)
    {
        for(j in -(n-1)..(n-1))
        {
            if(i == n)
            {
                print("*")
            }
            else
            {
                if(i-1 == abs(j))
                {
                    print("*")
                }
                else print(" ")
            }

        }
        println()
    }
}

fun main() {
    val n = Random.nextInt(3, 8)
    draw(n)
}