const val APP = "Belajar Kotlin"

fun main() {
    val firstName: String = "Khalil"
    val lastName: String = "Khalillll"

    // Error
    // lastName = "Al Faath"
    val age = 30

    println(firstName)
    println(age)

    // nullable
    var name: String? = null
    println(name)
    println(name?.length)

    println(APP)
}