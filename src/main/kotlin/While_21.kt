fun main() {
    var n=5
    var counter=1
    var summ=1.0
    var yigindi=1.0
    while (counter<=n){
        summ*=counter
        yigindi+=1/summ
        println(yigindi)
        counter++
    }
    println(yigindi)
}