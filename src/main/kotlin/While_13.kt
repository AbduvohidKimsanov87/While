fun main() {
    println("sonni kiriting")
    var n = readLine()!!.toInt()
    var ishora=1.0
    var kopaytma=1.1
    var count=1
    var summ=0.0
    while (count<=n){
        summ+=ishora*kopaytma
        ishora*=-1
        kopaytma+=0.1
        count++
    }
    println(summ)



}