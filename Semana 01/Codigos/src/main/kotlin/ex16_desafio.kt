fun main(){
    print("Que tipo de unidade quer converter:\n1-distância\n2-temperatura\n3-tempo\n-> ")
    val escolha = readln().toInt()
    if(escolha == 1){
        print("Quais são as unidades de origem e destino repectivamente:\n1- m -> km\n2- km -> m\n-> ")
        var opcao = readln().toInt()
        when(opcao) {
            1 -> {
                print("Digite quantos metros: ")
                var m = readln().toFloat()
                println("$m m são ${m/1000} km")
            }
            2 -> {
                print("Digite quantos quilômetros: ")
                var km = readln().toFloat()
                println("$km km são ${km*1000} m")
            }
            else -> println("Opção inválida")
        }
    }
    else if(escolha == 2){
        print("Quais são as unidades de origem e destino repectivamente:\n1- C -> F\n2- F -> C\n-> ")
        var opcao = readln().toInt()
        when(opcao) {
            1 -> {
                print("Digite quantos ºC: ")
                var c = readln().toInt()
                println("$c ºC são ${c * 9/5 + 32} ºF")
            }
            2 -> {
                print("Digite quantos ºF: ")
                var f = readln().toInt()
                println("$f ºF são ${(f-32)*5/9} ºC")
            }
            else -> println("Opção inválida")
        }
    }
    else if(escolha == 3){
        print("Quais são as unidades de origem e destino repectivamente:\n1- h -> min\n2- min -> h\n-> ")
        var opcao = readln().toInt()
        when(opcao) {
            1 -> {
                print("Digite quantas horas: ")
                var h = readln().toInt()
                println("$h h são ${h*60} min")
            }
            2 -> {
                print("Digite quantos minutos: ")
                var m = readln().toInt()
                println("$m min são ${m/60.0} h")
            }
            else -> println("Opção inválida")
        }
    }
    else{
        println("Opção inválida")
    }
}