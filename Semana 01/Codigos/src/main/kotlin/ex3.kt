fun main(){
    println("Digite dois números separados por enter:")
    var n1:Int = readln().toInt()
    var n2:Int = readln().toInt()
    println("Soma de $n1 + $n2 = ${n1+n2}")

    var b:Boolean = 5 > 3 && 2 < 4
    println(b)

    var c:Boolean = !(10 > 5 || 3 < 1)
    println(c)
}