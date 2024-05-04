fun main() {
    sayHello()
    print(add(1, 2))
}

fun sayHello() : Unit = println("hello")

fun add(a : Int, b : Int) : Int = a + b