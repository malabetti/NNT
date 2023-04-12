fun ex1a(){
    println("Parte 1:")
    val arr = Array(10) {(-1000..1000).random()}
    /*var arr = arrayOf((-1000..1000).random())
    repeat(9){
        arr += (-1000..1000).random()
    }*/
    var maior = arr[0]
    repeat(9){
        if(arr[it+1] > maior)
            maior = arr[it+1]
    }
    println("O maior número de ${arr.contentToString()} é:\n\t$maior")
}

fun ex2a(){
    println("Parte 2:")
    println("Digite 10 números (separados por enter):")
    val arr = Array(10) { readln().toInt() }
    var media = 0.0
    for(i in arr){
        media += i
    }
    println("A média de ${arr.contentToString()} é ${media/10}")
}

fun ex3a(){
    println("Parte 3:")
    val frutarr = arrayOf("amora", "morango", "uva", "abacate", "maçã", "banana", "pera", "abacaxi", "ameixa", "manga")
    for(i in frutarr){
        if(i[0].lowercase() == "a")
            println(i)
    }
}

fun main(){
    ex1a()
    ex2a()
    ex3a()
}