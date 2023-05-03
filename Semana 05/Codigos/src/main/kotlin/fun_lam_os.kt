fun calcular(a: Double, b: Double, operacao: (Double, Double) -> Double): Double {
    return operacao(a, b)
}

val maiornum = {list:MutableList<Int> -> list.max()}
fun somaLista(list1: MutableList<Int>, maior: (MutableList<Int>) -> Int, res1: Int): Int {
    var list = list1
    var res = res1
    if(list.size == 0)
        return res
    res += maior(list)
    list.remove(maior(list))
    return(somaLista(list, maior, res))
}

fun somaPor(n2: Int): (Int) -> Int {
    return {n1: Int -> n1 + n2}
}

fun printMensagem(n: Int): (String) -> Unit{
    return {str: String -> (1..n).forEach{println(str)} }
}

fun main() {
    //1 - Como posso usar uma função lambda para classificar uma lista em ordem crescente em Kotlin?
    val lista = MutableList(10) {(1..10).random() }
    val l = {list: MutableList<Int> ->
        for (i in 0 until 10){
            for (j in i+1 until 10){
                if(list[j] < list[i]){
                    val temp = list[j]
                    list[j] = list[i]
                    list[i] = temp
                }
            }
        }
        print(list)
    }
    println("$lista ordenada por função lambda:")
    println(l(lista))

    //2 - Como posso usar uma função de ordem superior para aplicar uma operação a cada elemento de uma lista em Kotlin?
    val soma = { a: Double, b: Double -> a + b }
    val subtracao = { a: Double, b: Double -> a - b }
    val multiplicacao = { a: Double, b: Double -> a * b }
    val divisao = { a: Double, b: Double -> a / b}
    val n1 = ((1..100).random()).toDouble()
    val n2 = ((1..100).random()).toDouble()
    println("$n1 + $n2 = ${calcular(n1, n2, soma)}")
    println("$n1 - $n2 = ${calcular(n1, n2, subtracao)}")
    println("$n1 * $n2 = ${calcular(n1, n2, multiplicacao)}")
    println("$n1 / $n2 = ${calcular(n1, n2, divisao)}")

    //3 - Como posso usar uma função lambda para filtrar elementos de uma lista em Kotlin?
    val filtro = {list:MutableList<Int>, n:Int -> list.indexOf(n)}
    val x = (1..10).random()
    println(lista)
    println(x)
    println("Index de $x na lista: ${filtro(lista, x)}")

    //4 - Como posso usar uma função lambda para encontrar o maior valor em uma lista em Kotlin?
    println("O maior valor da lista é ${maiornum(lista)}")

    //5 - Como posso usar uma função de ordem superior para somar todos os elementos de uma lista em Kotlin?
    println("Soma dos números: ${somaLista(lista, maiornum, 0)}")

    //6 - Como posso usar uma função de ordem superior para criar uma função que retorna a soma de dois números em Kotlin?
    val soma2 = somaPor(2)
    val soma120 = somaPor(120)
    val resultado1 = soma2(10)
    println("10 somado por 2 é $resultado1")
    val resultado2 = soma120(10)
    println("10 somado por 120 é $resultado2")

    //7 - Como posso usar uma função de ordem superior para imprimir uma mensagem n vezes em Kotlin?
    val mensagemx2 = printMensagem(2)
    val mensagemx10 = printMensagem(10)
    println(mensagemx2("Hello"))
    println(mensagemx10("World"))
}