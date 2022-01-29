fun main() {
    val narh= readLine()!!.toInt()

    var sanoq=0.1
    while (sanoq<=1){
        println("$sanoq kg olma ${narh*sanoq} so`m")
        sanoq+=0.1
    }
}