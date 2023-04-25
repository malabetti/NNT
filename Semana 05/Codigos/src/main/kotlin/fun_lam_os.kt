fun calcular(a: Double, b: Double, operacao: (Double, Double) -> Double): Double {
    return operacao(a, b)
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
}