fun main() {

    // 삼항연산
    var a : Int = 2
    var b : Int = if (a == 5) 8 else 3
    println(b)

    // 엘비스 연산
    // null인지 확이하고 대체값을 집어넣는 삼항연산 종류중 하나
    var number : Int? = null
    println(number ?: "null인 값이었음.")
}