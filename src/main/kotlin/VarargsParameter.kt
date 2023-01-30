fun hitungTotalWithArray(values: Array<Int>):Int{
    var total = 0
    for (value in values){
        total += value
    }
    return total
}

// varargs harus paling belakang
fun hitungTotalwithVarargs(vararg values:Int):Int{
    var total = 0
    for (value in values){
        total += value
    }
    return total
}

fun main() {
    val values = arrayOf(10,10,10,10)
    println(hitungTotalWithArray(values))
    var (a: Int,b: Int,c: Int,d: Int)= arrayOf(10,10,10,10)
    println(hitungTotalwithVarargs(10,10,10,10,10,10))
    println(hitungTotalwithVarargs(a,b,c,d,d))
}