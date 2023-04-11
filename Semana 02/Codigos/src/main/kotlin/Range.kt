fun ex1r(){
    println("Parte 1:")
    val r1 = 1..10
    for(i in r1){
        println(i)
    }
}

fun ex2r(){
    println("Parte 2:")
    val r2 = 'a'..'z'
    for(i in r2){
        println(i)
    }
}

fun ex3r(){
    println("Parte 3:")
    val r3 = 1..100
    for(i in r3){
        if(i%2 == 0)
            println(i)
    }
}

fun main(){
    ex1r()
    ex2r()
    ex3r()
}