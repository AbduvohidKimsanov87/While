fun main() {
    println(" a sonini kiriting")
    var a= readLine()!!.toInt()
    println("n darajani kiriting: ")
    var daraja= readLine()!!.toInt()
    var summ=1
    var sumdaryig=0
    var sanoq=1
    while (sanoq<=daraja){
        summ*=a
        sumdaryig+=summ
        println(summ)
        sanoq++
    }
    println("${sumdaryig+1}")
}