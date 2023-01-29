fun main() {
    // angka berurutan
    val range = 1..100

    println(range)

    // tidak bisa diakses dengan get atau set
    // digunakan hanya untuk perulangan

    // Operasi pada range
    println(range.count()) // 100
    println(range.contains(10)) // true
    println(range.first) // 1
    println(range.last) // 100
    println(range.step) // 1

    // Range terbalik
    val rangeTerbalik = 1000 downTo 0
    println("terbalik")
    println(rangeTerbalik.count()) // 1001
    println(rangeTerbalik.contains(10)) // true
    println(rangeTerbalik.first) // 1000
    println(rangeTerbalik.last) // 0
    println(rangeTerbalik.step) // -1

    // range dengan step
    val rangeStep = 1000 downTo 10 step 3
    println("Dengan step")
    println(rangeStep.count()) // 331
    println(rangeStep.contains(10)) // true
    println(rangeStep.first) // 1000
    println(rangeStep.last) // 10
    println(rangeStep.step) // -3


}