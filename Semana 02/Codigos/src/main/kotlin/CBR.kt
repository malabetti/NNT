fun ex1cbr(){
    println("Parte 1:")
    for(i in 0..10){
        if(i == 5)
            continue
        println(i)
    }
}

fun ex2dcbr(){
    println("Parte 2:")
    var i:Int
    while(true){
        print("Digite um número: ")
        i = readln().toInt()
        if(i < 0)
            break
    }
}

fun ex3dcbr(){
    println("Parte 3:")
    print("Digite um número inteiro positivo: ")
    val i = readln().toInt()
    var j = -1
    while(true){
        j++
        if(j == 4)
            continue
        if(j%2 == 0)
            println(j)
        if(j == i)
            break
    }
}

fun main(){
    ex1cbr()
    ex2dcbr()
    ex3dcbr()
}