infix fun String.to(type: String):String{
    if(type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Khalilullah Al Faath" to "UP"
    println(result)

    // bisa begini
    val resultLain = "Khalilullah Al Faath".to("UP")
    println(resultLain)

}