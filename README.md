# 001_kotlin_syntax


## Tìm hiểu về ngôn ngữ `Kotlin`

* Biến, kiểu dữ liệu
* Câu lệnh rẽ nhánh
* Vòng lặp
* Các Colections trong Kotlin
* Null safety

## Bài tập thực hành

* Bài 1

    Cho đoạn code dưới đây

    ``` kotlin
    import kotlin.random.Random

    fun draw(n : Int){
        // code
    }

    fun main() {
        val n = Random.nextInt(3, 8)
        draw(n)
    }
    ```

    Viết tiếp hàm `draw()` để chương trình khi chạy sẽ vẽ ra hình tam giác cân như sau:
    ```
    n = 3
      *
     * *
    *****

    n = 4
       *
      * *
     *   *
    *******
    ```

* Bài 2

    Cho đoạn code dưới đây

    ``` kotlin
    import kotlin.random.Random

    const val maxValue = 10000

    fun gen(start : Int = 1, end : Int = maxValue) : Int {
        return Random.nextInt(start, end)
    }

    fun findNextPrime(number : Int) : Int {
        // code
    }

    fun main() {
        val n = gen(1, 100)
        repeat(n) {
            println(findNextPrime(gen()))
        }
    }
    ```
    Viết tiếp hàm `findNextPrime(number : Int)` để tìm số nguyên tố nhỏ nhất lớn hơn hoặc bằng `number`.

* Bài 3

    Cho đoạn code dưới đây

    ``` kotlin
    import kotlin.random.Random

    const val maxValue = 10000
    val list = mutableListOf<Int>()

    fun gen(start : Int = 1, end : Int = maxValue) : Int {
        return Random.nextInt(start, end)
    }

    fun findMaxNumber(number : Int) : Int {
        // code
    }

    fun main() {
        val n = gen(1, 100)
        repeat(n) {
            list.add(gen())
        }
        repeat(n) {
            println(findMaxNumber(gen()))
        }
    }
    ```

    Cho số `n` và dãy số `list[]` có `n` phần tử. Viết tiếp hàm `findMaxNumber(number: Int)` để tìm số lớn nhất, nhỏ hơn `number`

* Bài 4

    ``` kotlin
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
        gen(n, "")
    }
    ```

    Đoạn code trên đang bị lỗi, hãy giải thích lỗi và đưa ra cách sửa có thể chạy được hàm `gen()`

## Yêu cầu nộp bài
* Nộp docs chuẩn bị kiến thức vào thư mục của mình đã gắn link trong [Notion](https://www.notion.so/Mobile-D21-e07fb6cdea764372a8cc3f7a6a8998d3)
* Checkout từ nhánh main, đặt tên nhánh mới là TênHĐ (vd: QuangNV, ThuanPT)
* Làm bài tập và nộp file .kt, commit và push vào nhánh mình.
* Chú ý: Khi làm 4 bài code, code mẫu đã cho không được xoá, sửa, có thể thêm các hàm xử lí hoặc các đoạn code vào vị trí bất kì.
