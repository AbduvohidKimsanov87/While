import kotlin.math.pow

fun main() {
    println("A sonini kiriting")
    var a= readLine()!!.toInt()
    println("B sonini kiriting")
    var b= readLine()!!.toInt()
    var count=a.toDouble()
    var summa:Double=0.0
    while (count<=b){
        summa+=count.pow(2)
        count++
    }
    println("$a dan $b gach bo`lgan sonlar kvadradlari yigindisi ${summa.toInt()} ga teng")
}