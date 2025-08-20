/*
6) Interfaces
Crie uma interface Imprimivel com o método imprimir(). Crie a classe Relatorio que implemente essa interface e imprima "Gerando relatório...".

fun main() {
    val r: Imprimivel = Relatorio()
    r.imprimir() // Saída: Gerando relatório...
}
*/
fun main() {
    val r: Imprimivel = Relatorio()
    r.imprimir()
}

interface Imprimivel {
    fun imprimir()
}

class Relatorio: Imprimivel {
    override fun imprimir(){
        println("Gerando relatório")
    }
}
