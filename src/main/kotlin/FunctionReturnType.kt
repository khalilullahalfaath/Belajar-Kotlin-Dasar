fun sum(a: Int, b: Int): Int{
    val total = a+b
    return total
}

fun main() {
    // bisa langsung dipanggil
    println(sum(2,3))

    // bisa ditampung
    val result = sum(200000, 23)
    println(result)

}