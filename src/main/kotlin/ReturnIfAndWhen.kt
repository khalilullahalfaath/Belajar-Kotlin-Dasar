fun main() {
    fun sayHello(name: String =""):String{
        // bisa langsung return dalam blok ifnya
        return if(name == ""){
            "Hello Bro"
        }else{
            "Hello ngap $name"
        }
    }

    println(sayHello("AWKOWKWKWOOWW"))
    println(sayHello())

    fun sayHelloWhen(name:String = ""): String{
        return when(name){
            "" -> "Hello ngap"
            else -> "Hello bang $name"
        }
    }

    println(sayHelloWhen("AWKOWKWKWOOWW"))
    println(sayHelloWhen())
}