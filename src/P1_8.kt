fun main(){
    println("Create Array using arrayOf() method:")
    val a1= arrayOf('A','B','C')
    println(a1.joinToString())
    println("Create Array using Array<Int>() and lambda function:")
    val a2= Array<Int>(5){10} //using lambda fun
    println(a2.joinToString())
    println("Create Array using Array<Int>()")
    val a3= Array<Int>(5){i->i*2} //'i' is indexing
    println(a3.joinToString())
//    a3.shuffle()
//    println(a3.joinToString())
//    a3.sort()
//    println(a3.joinToString())
    val twoDArr=arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6))
    println(twoDArr.contentDeepToString())

    println("Enter Array Values:")
    val a4 = Array(5) { "" }

// Fill the array using a loop
    for (i in 0 until 5) {
        print(" a[$i]: ")
        a4[i] = readln()
    }
    val a5=a4
    println("Entered Array:\n"+a4.joinToString())
    println("Sorted Array using in-built method:")
    println(a4.sorted().joinToString())
    println("Sorted Array without in-built method:")
    for(i in 0..<4) {
        val key=a5[i]
        var j=i-1
        while(j>=0&&a5[j]>key) {
            a5[j+1]=a5[j]
            j=j-1
        }
        a5[j+1]=key
    }
    println(a5.joinToString())
}