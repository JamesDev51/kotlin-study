package week_8

fun readInt() = try{
    readLine() ?. toInt()
}catch(e: NumberFormatException){
    null
}

fun main(){
    val arr= intArrayOf(3,9,7,6,4)
    val num = readInt()

//    val result=if(num!=null) arr.getOrNull(num) else null

//    val result = num ?. let {arr.getOrNull(it)} //num이 null이 아닌 경우에만 let 함수에 들어감
    val result = num ?. let {num -> arr.getOrNull(num)} //num이 null이 아닌 경우에만 let 함수에 들어감

    if(result != null ){
        println(result)
    }

}

