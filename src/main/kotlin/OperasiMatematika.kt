fun main() {
    // Kalau integer hasilnya integer juga
    val result = 10 / 3
    println(result) // 3

    // akan menghasilkan float
    val resultFloat = 10.0 / 3.0
    println(resultFloat) // 3.333333

    // sudah mendukung kalkulasi secara saintifik
    val resultVal = 10 + 10 / 2 // 15 bukan 10
    println(resultVal)

    //augmented assignments
    // pakai var
    var total: Int = 0
    val barang1 = 1000
    total+=barang1
    val barang2 = 2000
    total+=barang2
    val barang3 = 10000
    total+=barang3

    println(total) // 13000

    // unary operator
    total++ // total = total+1
    println(total)
    total--
    println(total)

    // minus
    val suhu = -5

    // kebalikan
    val salah = !true
    println(salah)

}