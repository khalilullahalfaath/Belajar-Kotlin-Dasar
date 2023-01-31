fun main() {
    fun factorialLoop(value:Int):Int{
        var result = 1
        for(i in value downTo 1){
            result *= i
        }
        return result
    }
    println(factorialLoop(10))

    fun factorialRecursive(value:Int):Int{
        if(value == 1){
            return 1
        }
        return value * factorialRecursive(value-1)
    }
    println(factorialRecursive(10))
}