import kotlin.math.pow

fun main() {
    println(" n sonini kiriting")
    var n= readLine()!!.toDouble()
    var count=1.0
    var summa=n.pow(2)
    while (count<=n){
        summa+=(n+count).pow(2)
        count++
    }
    println("natija $summa")
}