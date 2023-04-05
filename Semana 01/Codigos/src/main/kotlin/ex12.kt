fun main(){
    print("Digite um número de 1 a 7: ")
    val dia = readln().toInt()
    println("Dia da semana correspondente (começando da segunda-feira): ")
    val resultado = when (dia) {
        1 -> "Segunda-feira"
        2 -> "Terça-feira"
        3 -> "Quarta-feira"
        4 -> "Quinta-feira"
        5 -> "Sexta-feira"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Dia inválido"
    }
    println(resultado)
}
