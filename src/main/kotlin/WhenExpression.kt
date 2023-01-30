fun main() {
    val index = 'C'
    when(index){
        'A' -> println("Mantap")

        'B' -> {
            println("Gege")
        }
        else -> {
            println("HALO")
        }
        // output: Halo
    }

    // grouping
    when(index){
        'A','B','C' -> {
            println("Lulus bang")
        }
        else ->{
            println("Belum bang")
        }

        // output : Lulus Bang
    }

    // in
    val passValues : Array<Char> = arrayOf('A','B')
    when(index){
        in passValues -> {
            println("Mantap sekali")
        }
        !in passValues -> {
            println("coba lagi")
        }
        // output: coba lagi
    }

    // is
    when(index){
        is Char -> println("Ini char")
        !is Char -> println("Ini bukan char")
    }

    // pengganti ifelse
    when{
        index < 'D' -> {
            println("LULUS COK")
        }
        else -> println("Gagal")
    }

}