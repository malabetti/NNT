fun main(){
    //1 -  Como criar uma lista em Kotlin com os números de 1 a 10?
    val imlist = listOf(1,2,3,4,5,6,7,8,9,10) //IMUTÁVEL
    val list = mutableListOf(1,2,3,4,5,6,7,8,9,10) //MUTÁVEL
    println(list)
    //2 - Como adicionar um elemento na posição 2 de uma lista já existente em Kotlin?
    list[2] = 32
    println(list)
    //3 - Como remover o último elemento de uma lista em Kotlin?
    list.removeLast()
    println(list)
}