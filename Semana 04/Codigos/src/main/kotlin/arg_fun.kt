fun ex1af(vararg n:Int):Int {
    var res = 0
    for (i in n) res += i
    return res
}

fun ex2af(arr:Array<Int>, n:Int):List<Int> {
    val list = mutableListOf<Int>()
    for(i in arr){
        if(i > n) list.add(i)
    }
    return list
}

fun ex3af(arr:Array<Int>, n:Int):List<Int> {
    val list = mutableListOf<Int>()
    for(i in arr){
        list.add(i+n)
    }
    return list
}

fun ex4af(arr:Array<String>, char:Char):List<String> {
    val list = mutableListOf<String>()
    for(i in arr){
        if (i[0] == char) list.add(i)
    }
    return list
}

fun ex5af(arr:Array<Int>, n: Int):List<Int> {
    val list = mutableListOf<Int>()
    for(i in 0 until arr.size){
        if (i%n == 0) list.add(arr[i])
    }
    return list
}

fun main(){
    println(1)
    println("A soma dos números é ${ex1af(1, 2, 28, 35, 55, 44, 99, -12)}")

    println(2)
    val arr = Array(10){ (0..100).random() }
    val n = (0..100).random()
    println("Números do array maiores que $n = ${ex2af(arr, n)}")

    println(3)
    print("Digite um número para transformar o array: ")
    val transf = readln().toInt()
    println("${arr.contentToString()}\ntransformado por +($transf)\n${ex3af(arr, transf)}")

    println(4)
    println("Digite 10 strings: ")
    val arrS = Array(10){ readln() }
    print("Digite um caractere: ")
    val char = readln()[0]
    println("As string que começam com $char são: ${ex4af(arrS, char)}")

    println(5)
    print("Digite um número: ")
    val num = readln().toInt()
    println("${arr.contentToString()}\nvalores das posições múltiplas de $num:\n${ex5af(arr, num)}")
}