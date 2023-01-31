fun main() {
    fun hello(name: String, transformer: (String) -> String):String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String{
        return if(value == ""){
            "UPS"
        }else{
            value.toUpperCase()
        }
    }

    // sebagai parameter
    println(hello("Khalillll", upper))
    println(hello("Khalillll", fun(value: String): String{
        return if(value == ""){
            "UPS"
        }else{
            value.toLowerCase()
        }
    }))
}