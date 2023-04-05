fun main(){
    print("Digite a nota 1: ")
    var n1 = readln().toFloat()
    print("Digite a nota 2: ")
    var n2 = readln().toFloat()
    if((n1+n2)/2.0 > 7){
        println("Aprovado")
    }
    else{
        println("Reprovado")
    }
}