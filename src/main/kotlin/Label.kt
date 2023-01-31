fun main() {
    fun test(name: String, operation:(String) -> Unit):Unit = operation(name)

    test("") test@{
        if(it == ""){
            return@test
        }else{
            println("Khalil")
        }
    }
}