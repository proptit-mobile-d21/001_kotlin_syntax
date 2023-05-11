import java.lang.Exception

fun main(args: Array<String>) {
    var a: String? = null
    try {
        print(a!!.length)
    }
    catch(e: Exception){
        print(e)
    }
}