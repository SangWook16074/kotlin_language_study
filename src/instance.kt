/*
아이돌은 이름이랑 나이가 있고,
직업은 고정이지만, 소속 그룹이 있고
자기소개도 할 수 있어야 된다.
 */

fun main() {
}

interface ImplementIdol {

    // 그룹소개
    fun introduce() : Unit

    // 인사
    fun sayHello() : Unit
}

class Idol(
    var name : String,
    var age : Int,
) : ImplementIdol {
    override fun introduce() {
        TODO("Not yet implemented")
    }

    override fun sayHello() {
        TODO("Not yet implemented")
    }

}