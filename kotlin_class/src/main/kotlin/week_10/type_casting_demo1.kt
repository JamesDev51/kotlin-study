package week_10

fun main() {
    val objects = arrayOf("1",2,"3",4) //Any의 배열

    var sum=0

    for (obj in objects) { //obj의 타입은 any
        when (obj){
            is Int -> sum+=obj
            is String -> sum +=obj.toInt()
        }
//        if (obj is Int){ //smart cast
//            sum+=obj
//        }
    }
    println(sum)
}