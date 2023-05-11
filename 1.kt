import kotlin.random.Random

fun draw(n : Int){
    for(i in 1..n-1){
        for(j in 1..n+i+1){
            if(j == n - i + 1 || j == n + i - 1){
                print("*")
            }
            else{
                print(" ");
            }
        }
        print("\n");
    }
    
    for(i in 1..2*n-1){
       	print("*");
    }
}

fun main() {
    val n = Random.nextInt(3, 8)
    draw(n)
}