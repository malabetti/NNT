fun ex1(n1:Int, n2:Int):Int = n1 + n2

fun ex2(n:Int):Boolean {
    if(n%2 == 0) return true
    return false
}

fun ex3(str:String):Boolean {
    if(str == str.reversed()) return true
    return false
}

fun ex4(arr:Array<Int>):Int {
    return arr.max()
}

fun ex5(arr:Array<String>):List<String> {
    val list = mutableListOf<String>()
    for(i in arr){
        if(i.length > 5) list.add(i)
    }
    return list
}

fun main(){
    println(1)
    print("Digite um número: ")
    val n1 = readln().toInt()
    print("Digite um número: ")
    val n2 = readln().toInt()
    println("$n1 + $n2 = ${ex1(n1,n2)}")

    println(2)
    print("Digite um número: ")
    val n = readln().toInt()
    println("$n é par! -> É uma sentença ${ex2(n)}")

    println(3)
    print("Digite uma string: ")
    val str = readln()
    println("$str é um palíndromo! -> É uma sentença ${ex3(str)}")

    println(4)
    val arr = Array(10){ (0..100).random() }
    println("O maior número de: ${arr.contentToString()}\nÉ ${ex4(arr)}")

    println(5)
    println("Digite 10 strings: ")
    val arrS = Array(10){ readln() }
    println("As string com mais de 5 caracteres são: ${ex5(arrS)}")
}