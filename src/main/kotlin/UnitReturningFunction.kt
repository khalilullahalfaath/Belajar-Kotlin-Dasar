// menuliskan tipe data yang tidak return apa-apa sebagai unit,
// tidak perlu

fun printHello(nama: String):Unit{
    if(nama == null){
        println("Hello Bro")
    }else{
        println("Helo $nama")
    }
}
fun main() {
    printHello("Khalil")
}