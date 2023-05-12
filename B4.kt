import kotlin.random.Random

fun getValue() : Int{
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
    gen(n, "")
}

// Đoạn code cũ bị lỗi vì biến n trong hàm gen() là Int (kiểu không null), không phải Int? (kiểu có thể null).
// Có nhiều cách sửa: xử lý trường hợp null, hoặc đơn giản hơn là sửa kiểu trả về của hàm getValue() để compiler nhận biết rằng n chắc chắn khác null