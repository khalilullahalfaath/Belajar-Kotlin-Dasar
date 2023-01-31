// tipe data diikuti dengan titik
fun String.hello(): String = "Hello $this"
fun String.printHello() = println("Haloooooooooo $this")


fun main() {
    val name = "Khalil"
    println(name.hello())
    // menambahkan function pada tipe data
    "BUUSSSSHHH".printHello()
}