fun main() {
    println(" n-darajani kiriting")
    val n= readLine()!!.toInt()
    println("a sonini kiriting")
    val a= readLine()!!.toInt()
    var count=1
    var summa=1
    while (count<=n){
        summa*=a
        count++
    }
    println(summa)
}