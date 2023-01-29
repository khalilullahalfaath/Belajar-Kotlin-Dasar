fun main() {
    var age: Byte = 70
    var balance: Double = 12.5
    println(age) // 70
    println(balance) // 12.5

    // Konversi dari binary to Int
    var binary: Int = 0b101010101
    println(binary)

    // Bisa menggunakan tanda underscore untuk memisahkan angka
    var price: Long = 9_000_000_000L
    println(price)

    // Untuk konversi tipe data number, cukup dengan namaVariable.toTipeData()
    var priceInt: Int = price.toInt()
    println(priceInt)

    var binaryDouble: Double = binary.toDouble()
    println(binaryDouble)





}