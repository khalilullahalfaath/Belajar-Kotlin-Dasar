inline fun hello(noinline name: ()->String):String{
    return "Hello ${name()}"
}

fun main() {
    println(hello{"Khalil"})
}