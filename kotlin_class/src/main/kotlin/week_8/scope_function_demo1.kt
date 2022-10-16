package week_8

class Address{
    var city: String = ""
    var street: String = ""
    var house: String =""
    fun post(message: String):String="Message for ($city, $street, $house): $message"

}

fun main(){
    //모듈처럼 분리 가능
    val msg=Address().run{
        this.city="London"
        this.street="Baker Street"
        this.house="221b"
        post("Hello!")
    }

    //run - with 같음 => with는 파라미터로 받음
    val msg2=with(Address()){
        this.city="London"
        this.street="Baker Street"
        this.house="221b"
        post("Hello!")
    }

    //let -> 원하는  파라미터로 넘길 수 있음
    val msg3=Address().let { addr->
        addr.city="London"
        addr.street="Baker Street"
        addr.post("Hello!")
    }
    
    //apply -> 실행한 객체 자체를 반환함
    val msg4=Address().apply { 
        this.city="London"
        this.street="Baker Street"
        this.house="221b"
    }.post("Hello!")

    //also -> let이랑 비슷해서 it를 파람으로 주고 실행한 객체를 반환
    val msg5=Address().also{
        it.city="London"
        it.street="Baker Street"
        it.house="221b"
    }.post("Hello!")


}