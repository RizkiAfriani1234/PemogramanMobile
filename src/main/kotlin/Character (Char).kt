fun main(args: Array<String>) {
    var charA : Char = 'A'
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    print(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = " +strA)
}