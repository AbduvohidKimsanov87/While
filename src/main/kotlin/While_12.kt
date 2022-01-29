fun main() {
    var n=4
    var count=0
    var a=1.1
    var result=1.0
    while (count<n) {
        result += a
        a += 0.1
        count++
    }
    println(result)
}