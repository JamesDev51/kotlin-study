package week_7

fun check(s:String, condition: (Int, Char) -> Boolean):Boolean{
		for(i in s.indices){
				if(!condition(i,s[i])) return false
		}
		return true
}
fun main(){
		println(check("Hello"){_,c->c.isLetter()})
		println(check("Hello"){i,c -> i==0 || c.isLowerCase()}) //첫글자가 대문자는 무시, 나머지는 소문자

		//익명함수는 파라미터 괄호 안으로 넣어줘야함
		println(check("Hello",fun(_,c)=c.isLetter()))
		println(check("Hello",fun(i,c):Boolean {return i==0 || c.isLowerCase()}))
}