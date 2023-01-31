fun main() {
    // lambda sebagai parameter
    fun hello(name: String, transformer: (String) -> String):String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }
    // boleh dideklarasi dlu
    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("khalil", lambdaUpper))
    // boleh juga tidak
    println(hello("KHALIL", {value: String -> value.toLowerCase()}))


    // tanpa trailing lamda
    val result1 = hello("Khalil", {value: String -> value.toUpperCase()})
    // dengan trailing lambda
    val result2 = hello("Khalil"){value: String ->
        value.toUpperCase()
    }
}