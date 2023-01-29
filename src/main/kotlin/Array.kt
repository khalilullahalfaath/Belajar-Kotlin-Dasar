fun main() {
    val names: Array<String> = arrayOf("Khalil","Dudung")
    println(names) // output: [Ljava.lang.String;@4f3f5b24

    // akses nilai
    println(names[0])
    // ubah nilai
    names.set(0, "Ahmad")
    println(names[0])

    // names[0] = null -> error
    val nilai: Array<Int> = arrayOf(1,2,3,4)
    println(nilai[2])

    // array nullables
    val members: Array<String?> = arrayOfNulls(12)
    println(members[0])
}