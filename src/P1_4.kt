fun main(){
    println("Enter a number: ")
    val num = readLine()!!.toInt()
    if (num%2==0){
        println("$num is even")
    }else{
        println("$num is odd")
    }
}