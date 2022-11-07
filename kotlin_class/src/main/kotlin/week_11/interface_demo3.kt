package week_11

interface Car3{
    fun move(){
        println("I'm riding")
    }
}

interface Ship2 {
    fun move()
}

class Amphibia : Car3, Ship2 {
    override fun move() { //Car3에 정의되어 있더라도 Ship2는 없기 때문에 재구현 해야함
        super.move()
    }
}

fun main() {
    val a = Amphibia()

    a.move()

}