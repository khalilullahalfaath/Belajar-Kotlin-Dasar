fun main() {
    // bisa mengakses variable di scope yang sama
    var counter = 0
    val lambdaIncrement: () -> Unit = {
        println("lambda increment")
        counter++
    }

    val anonymousIncrement = fun(){
        println("Anonymous Function increment")
        counter++
    }

    fun functionIncrement(){
        println("Function increment")
        counter++
    }
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    println(counter)


}