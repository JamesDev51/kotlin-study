package week_6

class Bigint private constructor(private var strNum:String){
    companion object Factory{
        fun create(s: String?): Bigint? {
            if (s == null || s=="" ) return null //null , 빈 문자
            for(idx in 0.. s.lastIndex){ //숫자 아닌 문자
                if (s[idx] !in '0' ..'9') return null
            }
            return Bigint(s)
        }
    }

    fun plus(intNum:Int):Bigint{
        return Bigint(addVeryLongStringDecimal(this.strNum,intNum.toString()))
    }
    fun plus(bi:Bigint?):Bigint{
        if(bi==null) { //null 객체가 들어온 경우
            return Bigint(addVeryLongStringDecimal(this.strNum,"10000"))
        }
        return Bigint(addVeryLongStringDecimal(strNum,bi.strNum))
    }

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

    override fun toString(): String {
        return this.strNum
    }
}

fun main(){
//    val e=Bigint("12345") //private constructor

    val a=Bigint.create(readLine())
    val b=Bigint.create(readLine())
    val c = try{  //null, 다른내용 -> 0
        readLine()?.toInt() ?: 0
    }catch(_: NumberFormatException){
        0
    }

    println(a?.plus(b)) //a가 널이면 연산 안하면 null 반환
    println(a?.plus(c)) //int 연산


}