fun sayHello(firstName: String, lastName:String?){
    // untuk mengatasi error paramter kosong
    if(lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello ${"$firstName $lastName"}")
    }

}

fun main() {
    // wajib dimasukkan di parameternya
    // walaupun kosong
    sayHello("Khalilullah","Al Faath")
    sayHello("Budi",null)
}