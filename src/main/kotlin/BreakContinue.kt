fun main() {
    var i = 0

    while (true){
        println("Halo ke-$i")
        i++

        if (i >= 10){
            break
        }

    }

    for(i in 1..10){
        if(i % 2 == 0) continue
        println(i)
    }
}