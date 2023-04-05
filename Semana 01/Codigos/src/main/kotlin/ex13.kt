fun main(){
    print("Digite um dos seguintes animais:\n-cachorro\n-pinguim\n-gato\n-arara\n-lagarto\n-> ")
    val animal = readln()
    println("O animal $animal é: ")
    val resultado = when (animal) {
        "cachorro" -> "mamífero"
        "pinguim" -> "ave"
        "gato" -> "mamífero"
        "arara" -> "ave"
        "lagarto" -> "réptil"
        else -> "Não cadastrado"
    }
    println(resultado)
}
