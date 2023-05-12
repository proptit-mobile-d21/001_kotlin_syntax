import kotlin.random.Random

fun getValue(): Int? {
    return Random.nextInt(2, 5)
}

fun gen(n: Int, s: String) {
    if (n == 0) {
        println(s)
        return
    }
    gen(n - 1, s + "0")
    gen(n - 1, s + "1")
}

fun main() {
    var n: Int? = null
    n = getValue()
    // gen(n, "")
    /*
    - Biến n có kiểu dữ liệu là nullable, tức là có thể có giá trị là null
    hoặc là một giá trị kiểu Int.
    - Nhưng hàm gen() yêu cầu đối số đầu vào kiểu dữ liệu Int, không chấp nhận
     giá trị null.
     => Vì vậy, khi biến n có giá trị là null, chương trình sẽ gặp lỗi khi thực hiện
     => Để khắc phục lỗi này, ta có thể thêm kiểm tra null cho biến n trước khi truyền
      đối số vào hàm gen()
    */
    if (n != null) {
        gen(n, "")
    } else {
        println("n is null")
    }
}