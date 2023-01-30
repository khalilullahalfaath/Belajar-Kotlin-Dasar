fun main() {
    val names = arrayOf("Khalilullah", "Al", "Faath")

    var total = 0
    for (name in names){
        // name itu immutable
        println(name)
        total++
    }
    println("total perulangan = $total")

    // for range
    for (value in 0..10) print("$value ")
    println()
    for (value in 0..100 step 2) print("$value ")
    println()
    for (value in 100 downTo 0 step 10) print("$value ")
    println()
    // array size
    val ukuranArray = names.size - 1

    for (i in 0..ukuranArray){
        print("$i ")
        println(names[i]) //names.get(i) juga bisa
    }
}