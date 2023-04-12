fun ex1dw(){
    println("Parte 1:")
    var i = 1
    do{
        println(i)
        i++
    }while(i <= 10)
}

fun ex2dw(){
    println("Parte 2:")
    var i:Int
    do{
        print("Digite um número: ")
        i = readln().toInt()
    }while(i >= 0)
}

fun ex3dw(){
    println("Parte 3:")
    var i:Int
    val sort = (1..10).random()
    do{
        print("Digite um número de 1 a 10: ")
        i = readln().toInt()
    }while(i != sort)
    println("Você acertou, era $sort!")
}

fun main(){
    ex1dw()
    ex2dw()
    ex3dw()
}