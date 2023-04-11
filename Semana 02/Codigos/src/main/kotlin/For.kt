fun ex1f(){
    println("Parte 1:")
    for(i in 1..10){
        println(i)
    }
}

fun ex2f(){
    println("Parte 2:")
    for(i in 0..20){
        if(i%2 == 0){
            println(i)
        }
    }
}

fun ex3f(){
    println("Parte 3:")
    for(i in 9 downTo 1 step 2){
        println(i)
    }
}

fun main(){
    ex1f()
    ex2f()
    ex3f()
}