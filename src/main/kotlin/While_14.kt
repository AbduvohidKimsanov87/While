fun main() {
    println("n sonini kiriting")
    val n= readLine()!!.toInt()
    val qadam=2
    var count=1
    var sum=0.0
    while (count<=n){
        sum+=count+qadam
        count++
    }
    println(sum)
}