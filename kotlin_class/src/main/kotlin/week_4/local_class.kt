package week_4

fun main(){
    var x = 1

    class Counter{
        fun increment(){
            x++
        }
    }

    val c  = Counter()
    c.increment()

    println(x)
}
