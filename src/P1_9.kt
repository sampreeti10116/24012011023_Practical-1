fun main() {
    val a1 = arrayOf(23, 66, 59, 38, 12)
    println("Array: ${a1.joinToString()}")
    var max = a1[0]
    for (i in a1.indices) {
        if (max < a1[i]) {
            max = a1[i]
        }
    }
    println("Maximum= $max")
}