fun main() {
    var narh= readLine()!!.toInt()
    var sanoq=0.2
    while (sanoq<=2){
        println("$sanoq kilo olma ${narh*sanoq} so`m")
        sanoq+=0.2
    }
}