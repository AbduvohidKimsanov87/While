fun main() {
    println("a sonini kiriting")
    val a= readLine()!!.toInt()
    println("n-darajani kiriting")
    var power= readLine()!!.toInt()
    var count=1
    var summ=1
    while (count<=power){
        summ*=a
        println(summ)
        count++

    }
    println(summ)

}