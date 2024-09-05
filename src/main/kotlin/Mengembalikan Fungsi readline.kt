fun main(args: Array<String>) {
    println("Enter a number and I'II double it: ")
    val input = readLine()!!
    var a = input.toInt()
    println(a)

    println("Enter a number, and I'II squer it :")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: + square")
}