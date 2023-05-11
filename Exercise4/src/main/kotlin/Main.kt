import kotlin.random.Random

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

fun main() {
    var n: Int? = null
    n = getValue()
    /*
    gen(n, "") lỗi bởi n đang là một biến Nullable nên khi gọi hàm cần sử dụng safety call
    cách xử lý:
    - sử dụng toán tử ?
    - if (n!=null) gen(it,"")
    - try...catch...
    */
    n?.let { gen(it, "") }
}