fun main() {
    var age : Int? = null
    var sum : Int = 0
    if (age != null) {
        sum = age!! + 10

    }
    print(sum)
}