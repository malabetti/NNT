fun main(){
    print("Digite uma letra (minúscula): ")
    val letra = readln()
    println("A letra $letra é: ")
    val resultado = when (letra) {
        "a" -> "Vogal"
        "e" -> "Vogal"
        "i" -> "Vogal"
        "o" -> "Vogal"
        "u" -> "Vogal"
        else -> "Consoante"
    }
    println(resultado)
}
