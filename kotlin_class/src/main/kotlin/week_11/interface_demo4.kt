package week_11

interface Car4{
    fun move(){
        println("I'm riding")
    }
}

interface Ship3 {
    fun move(){
        println("I'm sailing")
    }
}

class Amphibiaa : Car4, Ship3 {
    override fun move() { //Car3에 정의되어 있더라도 Ship2는 없기 때문에 재구현 해야함
        super<Car4>.move()
        println("Or")
        super<Ship3>.move()
    }
}

fun main() {
    val a = Amphibiaa()

    a.move()

}