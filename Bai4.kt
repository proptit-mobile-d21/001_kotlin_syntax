import kotlin.random.Random
class Bai4 {
    fun getValue() : Int?{
        return Random.nextInt(2, 5)
    }

    fun gen(n : Int, s : String) {
        if(n == 0){
            println(s)
            return
        }
        gen(n - 1, s + "0")
        gen(n - 1, s + "1")
    }
}