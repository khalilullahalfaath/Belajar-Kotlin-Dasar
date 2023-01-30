fun sayHello(firstName: String, lastName:String = ""){
    // kalau lastName tidak ada maka yang dipanggil parameter defaultnya
    println("Hello ${"$firstName $lastName"}")

}

fun main() {
    // lastName tidak wajib diisi sudah ada nilai default
    sayHello("Khalilullah","Al Faath")
    sayHello("Budi")
}