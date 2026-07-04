fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
fun main(){
    println("Enter a number: ")
    val num = readLine()!!.toInt()

    val result = factorial(num)
    println("Factorial of $num is $result")

}