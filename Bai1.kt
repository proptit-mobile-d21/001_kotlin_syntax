import kotlin.random.Random

fun draw(n : Int){
    for(i in 0..n-2)
    {
        for(j in -(n-1)..n-1)
        {
            if(j==0+i || j==0-i)
            {
                print("*")
            } else print(" ")
        }
        print("\n")
    }
    for(i in 1..2*n-1)
    {
        print("*")
    }
}

fun main() {
    val n = Random.nextInt(3, 8)
    draw(n)
}