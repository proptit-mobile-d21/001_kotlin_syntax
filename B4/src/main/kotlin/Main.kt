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
    //gen(n, "")

    //Hàm gen ở trên bị lỗi do:
    //Tham số truyền vào phải là kiểu Int mà ở đây n được khai báo là kiểu Int? (Có thể chứa giá trị null).
    //Để hàm gen() chạy bình thường ta chỉ cần thêm "!!" ở sau n để trình biên dịch bỏ qua lỗi trong quá trình thực thi.
    //Vì getValue() chỉ trả về giá trị từ 2-5 cho nên chương trình sẽ không rơi vào trường hợp báo lỗi sau khi chạy.
    gen(n!!, "")
}