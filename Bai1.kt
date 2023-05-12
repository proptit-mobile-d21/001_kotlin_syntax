import kotlin.math.abs

class Bai1 {
    fun draw(n : Int){
        // code
        for(i in 0 until n){
            for(j in -n+1 until n){
                if(i == n-1|| abs(i) - abs(j) == 0)
                    print('*')
                else print(' ')
            }
            println()
        }
    }
}