fun main(){
    //1 - Como criar um Set em Kotlin com os números de 1 a 5?
    val imset = setOf(1,2,3,4,5) //IMUTÁVEL
    val set = mutableSetOf(1,2,3,4,5) //MUTÁVEL
    println(set)
    //2 - Como verificar se um determinado elemento existe em um Set em Kotlin?
    val c = set.contains(8)
    println(c)
    //3 - Como remover um elemento específico de um Set em Kotlin?
    set.remove(3)
    println(set)
}