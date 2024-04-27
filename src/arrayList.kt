fun main() {
    // 어레이는 잘 사용안함
//    var arr = listOf(1, 2, 3, 4, 5,)
//    println(arr)
//    println(arr[0])
//    println(arr[3])
//    println(arr[2])
//    arr[4] = 10

    var arr = mutableListOf(1, 2, 3, 4, 5)
    println(arr)
    println(arr[0])
    println(arr[3])
    arr[0] = 10
    println(arr)

    arr.removeLast()
    println(arr)
    arr.removeFirst()
    println(arr)

    arr.addLast(10)
    println(arr)
    arr.addFirst(1)
    println(arr)

    arr.addAll(3, mutableListOf(1, 2, 3))
    println(arr)
    arr.clear()
    println(arr)
}