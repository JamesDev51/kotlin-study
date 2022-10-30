package week_10

class Holder{
    var o :Any =""
}

fun main() {
    val holder = Holder()

    (holder.o as? String)?.let{it ->
        println(it.length)
    }
}