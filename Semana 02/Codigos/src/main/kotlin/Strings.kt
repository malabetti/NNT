fun ex1s(){
    println("Parte 1:")
    print("Digite uma frase: ")
    val str = readln()
    println("\"$str\" possui um total de ${str.length} caracteres!")
}

fun ex2s(){
    println("Parte 2:")
    print("Digite uma frase: ")
    val str = readln()
    var strinv = ""
    for(i in str.length - 1 downTo 0){
        strinv = strinv.plus(str[i])
    }
    println(strinv)
}

fun ex3s(){
    println("Parte 3:")
    print("Digite uma frase: ")
    val str = readln()
    val vogais = arrayOf("a", "e", "i", "o", "u")
    for(i in str){
        if(i.lowercase() in vogais){
            println(i)
        }
    }
}

fun main(){
    ex1s()
    ex2s()
    ex3s()
}