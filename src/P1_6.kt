fun main(){
    println("Enter first number: ")
    val num1 = readLine()!!.toInt()

    println("Enter second number: ")
    val num2 = readLine()!!.toInt()

    println("Enter third number: ")
    val num3 = readLine()!!.toInt()

    val addition = add(num1, num2, num3)
    val subtraction = subtract(num1, num2, num3)
    val multiplication = multiply(num1, num2, num3)
    val division = divide(num2, num1)

    println("Addition of $num1, $num2, $num3 is $addition")
    println("Subtraction of $num1, $num2, $num3 is $subtraction")
    println("Multiplication of $num1, $num2, $num3 is $multiplication")
    println("Division of $num2, $num1 is $division")
}

fun add(a: Int, b: Int, c: Int): Int = a + b + c
fun subtract(a: Int, b: Int, c: Int): Int = a - b - c
fun multiply(a: Int, b: Int, c: Int): Int = a * b * c
fun divide(a: Int, b: Int): Int {
    return if (b != 0) a / b else 0
}