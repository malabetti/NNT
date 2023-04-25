import kotlin.math.min

//1
fun fatorial(n: Int): Int {
    if (n <= 1)
        return 1
    return n * fatorial(n - 1)
}

//2
fun fibonacci(n: Int): Int {
    if(n <= 1)
        return n
    return fibonacci(n-1) + fibonacci(n-2)
}

//3
fun MDC(n1: Int, n2: Int, x: Int): Int {
    if(x == 0) return -1
    else if(n1 % x == 0 && n2 % x == 0)
        return x
    return MDC(n1, n2, x-1)
}

//4
fun palindromo(str1:String): Boolean {
    var str = str1
    if(str.length <= 1)
        return true
    if(str[0] == str[str.lastIndex]) {
        str = str.drop(0)
        str = str.drop(str.lastIndex)
        return palindromo(str)
    }
    return false
}

//5
fun soma(arr: Array<Int>, sum: Int): Int {
    if(arr.size == 0)
        return sum
    val n = arr[0] + sum
    val arr2 = (arr.drop(1)).toTypedArray()
    return soma(arr2, n)
}

fun main() {
    val x = (1..10).random()

    println("O fatorial de $x é ${fatorial(x)}.")

    println("O número $x da sequência de fibonacci é ${fibonacci(x)}.")

    println("Digite dois números para calcular o MDC entre eles: ")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val menor = min(n1, n2)
    println("O MDC de $n1 e $n2 é ${MDC(n1, n2, menor)} (-1 se não existir).")

    print("Digite uma string: ")
    val str = readln()
    val retorno_palindromo = { x: Boolean -> when (x) {
        true -> "verdadeira"
        false -> "falsa"
    } }
    println("$str é um palíndromo, é uma afirmação ${retorno_palindromo(palindromo(str))}")

    val arr = Array((1..10).random()){ (1..100).random() }
    println("A soma dos elementos de ${arr.contentToString()} é ${soma(arr, 0)}")
}
