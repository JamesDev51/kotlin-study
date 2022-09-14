package week_3.in_class

fun main(){
    val a  = IntArray(10){it*it}
    var sum=0

    for (x in a){
        sum+=x
    }

    println("Sum: $sum")

    for (i in 0..a.lastIndex){
        a[i] *=2
        println("a[$i] : ${a[i]}")
    }

    println()
    for (i in a.indices step 2){
        a[i] *=2
        println("a[$i] : ${a[i]}")
    }

}