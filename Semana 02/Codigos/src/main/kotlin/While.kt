fun ex1w(){
    println("Parte 1:")
    var i = 1
    while(i <= 10){
        println(i)
        i++
    }
}

fun ex2w(){
    println("Parte 2:")
    var i = 0
    while(i <= 20){
        println(i)
        i+=2
    }
}

fun ex3w(){
    println("Parte 3:")
    var i = 9
    while(i >= 0){
        println(i)
        i-=2
    }
}

fun main(){
    ex1w()
    ex2w()
    ex3w()
}