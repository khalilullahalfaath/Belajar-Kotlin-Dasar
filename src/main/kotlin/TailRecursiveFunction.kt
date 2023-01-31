fun main() {

    fun displayWithout(value: Int){
        println("$value")
        if (value > 0){
            displayWithout(value-1)
        }

    }

    // displayWithout(100000000)

    tailrec fun display(value:Int){
        print("$value ")
        if(value > 0){
            display(value-1)
        }
    }

    //display(1000000000)

    // factorial
    fun factorialRecursiveWithout(value:Int):Int{
        if(value == 1){
            return 1
        }
        return value * factorialRecursiveWithout(value-1)
    }
    //println(factorialRecursiveWithout(10))

    tailrec fun factorialRecursiveWith(value: Long, total: Long = 1):Long{
        return when(value){
            1L -> total
            else -> factorialRecursiveWith(value - 1, total*value)
        }
    }
    println(factorialRecursiveWith(10))


}