class Pessoa(nome:String, idade:Int){
    val name = nome
    val age = idade
}

fun main(){
    var total = 0
    var opc:Int
    var arr = arrayOf(Pessoa("", -1))
    do{
        print("""
            |Digite a opção desejada:
            |1-adicionar uma nova pessoa ao array
            |2-exibir a lista de todas as pessoas
            |3-exibir a média de idade das pessoas
            |4-buscar uma pessoa pelo nome
            |5-remover uma pessoa pelo nome
            |6-sair
            |-> 
        """.trimMargin())
        opc = readln().toInt()
        when(opc) {
            1 -> {
                print("Digite o nome: ")
                val nome = readln()
                print("Digite a idade: ")
                val idade = readln().toInt()

                if(total == 0){
                    val arr2 = arrayOf(Pessoa(nome, idade))
                    arr = arr2
                }
                else{
                    arr += Pessoa(nome, idade)
                }
                total++
            }
            2 -> {
                if(total == 0) {
                    println("Não há pessoas cadastradas!")
                }
                else
                    for(i in arr){
                        println("Nome: ${i.name}, Idade: ${i.age}")
                    }
            }
            3 -> {
                var media = 0.0
                if(total == 0) {
                    println("Não há pessoas cadastradas!")
                }
                else{
                    for(i in arr){
                        media += i.age
                    }
                    println("A média das idades é ${media/total}")
                }
            }
            4 -> {
                if(total == 0) {
                    println("Não há pessoas cadastradas!")
                }
                else{
                    print("Digite o nome: ")
                    val nome = readln()
                    for(i in arr){
                        if(i.name == nome){
                            println("Nome: ${i.name}, Idade: ${i.age}")
                        }
                    }
                }
            }
            5 -> {
                if(total == 0) {
                    println("Não há pessoas cadastradas!")
                }
                else{
                    print("Digite o nome: ")
                    val nome = readln()
                    var arr2 = arrayOf(arr[0])
                    for(i in 1 until total){
                        if(arr[i].name != nome){
                            arr2 += arr[i]
                        }
                    }
                    arr = arr2
                }
            }
            6 -> {
                println("Saindo!")
            }
            else -> println("Opção inválida!")
        }
    }while(opc != 6)
}