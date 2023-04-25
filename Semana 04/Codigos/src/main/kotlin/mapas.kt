fun main(){
    //1 - Como criar um Map em Kotlin com as cores e seus respectivos códigos RGB?
    val immap = mapOf("Red" to "(255, 0, 0)", "Green" to "(0, 255, 0)", "Blue" to "(0, 0, 255)") //IMUTÁVEL
    val map = mutableMapOf("Red" to "(255, 0, 0)", "Green" to "(0, 255, 0)", "Blue" to "(0, 0, 255)") //MUTÁVEL
    println(map)
    //2 - Como verificar se um determinado elemento existe em um Map em Kotlin?
    val c = map.contains("Green")
    println(c)
    //3 - Como remover um elemento específico de um Map em Kotlin?
    map.remove("Blue")
    println(map)
}