fun main() {
    println("n sonini kiriting")
    var n = readLine()!!.toInt()
    var count=1.0
    var summs:Double=0.0
    while (count <= n){
        summs+=1/count
        count++
    }
    println("natija ${summs}")





}