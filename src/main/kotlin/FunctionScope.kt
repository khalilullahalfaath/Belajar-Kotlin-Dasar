
// kalau sejajar bisa diakses darimanapun
fun contohHelloWorld(){

}

fun satu(){
    // bisa diakses
    contohHelloWorld()
    // tidak bisa diakses
    // contohlainHelloworld()
}

fun main() {

    // hanya bisa diakses di sini
    fun contohLainHelloWorld(){

    }
}