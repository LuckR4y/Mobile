/*
8) Object e Herança
Crie uma classe Animal com método som(). Crie uma classe Gato que herde de Animal e sobrescreva som() para imprimir "Miau". Crie um object chamado Fazenda que possua uma função emitirSons(animais: List<Animal>) que chame som() para cada animal.

fun main() {
    val animais = listOf(Gato(), Gato(), Gato())
    Fazenda.emitirSons(animais)
    // Saída esperada:
    // Miau
    // Miau
    // Miau
}
*/

fun main() {
    val animais = listOf(Aluno(), Aluno(), Aluno())
    Sala.emitirSons(animais)
}

open class Animal {
    open fun som() {
        println("Aluno fazendo som")
    }
}

class Aluno : Animal() {
    override fun som() {
        println("Boa Noite Bruno!")
    }
}

object Sala {
    fun emitirSons(animais: List<Animal>) {
        animais.forEach { it.som() }
    }
}
