fun main(){
    val matrix1 = Matrix(arrayOf(intArrayOf(3,-2,5),intArrayOf(3,0,4)),2,3)
    val matrix2a = Matrix(arrayOf(intArrayOf(2,3),intArrayOf(-9,0),intArrayOf(0,4)),3,2)
    val matrix2b = Matrix(arrayOf(intArrayOf(6,3),intArrayOf(-9,0),intArrayOf(5,4)),3,2)

    println("**************Addition**************")
    println("Matrix 1:\n${matrix2b}")
    println("Matrix 2:\n${matrix2a}")
    val thirdMatrix = matrix2b + matrix2a
    println("Addition:\n$thirdMatrix")

    println("**************Subtraction**************")
    println("Matrix 1:\n$matrix2b")
    println("Matrix 2:\n$matrix2a")
    val subtractMatrix = matrix2b - matrix2a
    println("Subtraction:\n$subtractMatrix")

    println("**************Multiplication**************")
    println("Matrix 1:\n$matrix1")
    println("Matrix 2:\n$matrix2a")
    val multiplication = matrix1 * matrix2a
    println("Multiplication:\n$multiplication")
}
class Matrix(val matrix: Array<IntArray>, val rows: Int, val cols: Int) {
    operator fun plus(other:Matrix):Matrix{
        val result = Array(rows) { IntArray(cols) }
        for(i in 0 until rows){
            for(j in 0 until cols){
                result[i][j] = this.matrix[i][j] + other.matrix[i][j]
            }
        }
        return Matrix(result,rows,cols)
    }

    operator fun minus(other:Matrix):Matrix{
        val result = Array(rows) { IntArray(cols) }
        for(i in 0 until rows){
            for(j in 0 until cols){
                result[i][j] = this.matrix[i][j] - other.matrix[i][j]
            }
        }
        return Matrix(result,rows,cols)
    }

    operator fun times(other:Matrix):Matrix{
        val result = Array(rows) { IntArray(cols) }
        for(i in 0 until rows){
            for(j in 0 until other.cols){
                for(k in 0 until cols){
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j]
                }

            }
        }
        return Matrix(result,rows,other.cols)
    }

    override fun toString(): String {
        return matrix.joinToString("\n"){row->row.joinToString(" ")}
    }
}