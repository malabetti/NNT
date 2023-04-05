fun main(){
    print("Digite um número inteiro: ")
    var n = readln().toInt()
    if(n > 0)
        println("Positivo")
    else if(n < 0)
        println("Negativo")
    else
        println("Zero")
}