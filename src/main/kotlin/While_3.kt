fun main() {
    var a= readLine()!!.toInt()
    var b= readLine()!!.toInt()
    var counter=b-1
    while (counter>a){
        println(counter)
        counter--
    }
    println("total printed values ${b-a-1}")

}