fun main() {
    var n=5
    var count=1
    var yigindi=0
    var summ=1
    while (count<=n){
        summ*=count
        yigindi+=summ
        println(summ)
        count++
    }
    println(yigindi)
}