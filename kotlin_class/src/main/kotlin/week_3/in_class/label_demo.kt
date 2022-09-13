package week_3.in_class

fun indexOf(subArr: IntArray, arr:IntArray): Int{
    outerLoop@
    for ( i in arr.indices){
        for( j in subArr.indices ){
            if( arr[i+j] != subArr[j])continue@outerLoop
        }
        return i
    }
    return -1
}

fun main(){
    val arr = intArrayOf(2,7,3,4,6,9,4,2)
    val sub = intArrayOf(4,6,9)

    println(indexOf(sub,arr))


}