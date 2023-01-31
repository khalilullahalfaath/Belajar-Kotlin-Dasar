fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    // membuat lambda expression
    // (tipe data parameter) -> return type
    val contohLambda: (String,String) -> String = {
        firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    println(contohLambda("Khalilullah","Al Faath"))

    // contoh
    val contohIt : (String) -> String ={
        "Hello $it"
    }
    println(contohIt("Khalilullah"))

    // method reference
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Khalilullah Al Faath"))
}