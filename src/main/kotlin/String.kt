fun main() {
    var firstName :String = "Khalilullah"
    var lastName : String = "Al Faath"
    var address : String = """ 
        apa yang terjadi 
        di sana sini 
        lorem ipsum 
    """

    println("-----------default-----------")
    println(address)

    address = """ 
        apa yang terjadi 
        di sana sini 
        lorem ipsum 
    """.trimIndent()
    println("------------trimIndent()------------")
    println(address)

    address = """ 
        |apa yang terjadi 
        |di sana sini 
        |lorem ipsum 
    """.trimMargin()
    println("------------trimMargin()------------")
    println(address)

    println("-------------------")

    // String template
    var fullName : String = "$firstName $lastName"
    println(fullName)

    // String concatination
    fullName = firstName + " " + lastName
    println(fullName)

    var desc : String = "$fullName length = ${fullName.length}"

    println(fullName)
    print(desc)
}