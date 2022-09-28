package week_3

fun addVeryLongStringDecimal(a:String, b:String):String{
    var aIdx= a.lastIndex
    var bIdx = b.lastIndex
    var res=""
    var carry=0

    while (aIdx>=0 || bIdx>=0){
        val aVal = if(aIdx<0) 0
                            else if (a[aIdx] in '0' ..'9') a[aIdx] - '0'
                            else return "?"
        val bVal = if(bIdx<0) 0
                            else if (b[bIdx] in '0' ..'9') b[bIdx] - '0'
                            else return "?"
        var sum=aVal+bVal+carry
        val mod=sum%10
        res+=mod.toString()
        if(sum>=10) carry=1
        else carry=0

        aIdx--;bIdx--
    }
    return res.reversed()
}

fun main(){
    val a= readLine()!!
    val b = readLine()!!

    val res= addVeryLongStringDecimal(a,b)

    //println(addVeryLongStringDecimal(a,b))
    println(res)
    println(res == "987645970294645586051573938303404501682217474474")
}