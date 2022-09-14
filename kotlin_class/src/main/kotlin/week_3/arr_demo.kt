package week_3

fun main(){
    val arr = IntArray(10){it*it}

    for (n in arr){
        println(n)
    }

    println()
    val subArr= arr.sliceArray(2..5)
    for (n in subArr){
        println(n)
    }

    println()
    val subArr2 = arr.sliceArray(2 until 5)
    for(n in subArr2){
        println(n)
    }
}