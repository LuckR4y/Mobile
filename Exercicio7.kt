/*
7) Data class
Crie uma data class Produto com nome e preco. Implemente a função desconto(percentual: Double): Produto que retorne uma cópia do produto com o preço atualizado.

fun main() {
    val p = Produto("Notebook", 3000.0)
    val pComDesconto = p.desconto(10.0)
    println(pComDesconto) // Produto(nome=Notebook, preco=2700.0)
}
*/
fun main() {
    val p = Produto("Notebook", 3000.0)
    val pComDesconto = p.desconto(10.0)
    println(pComDesconto)
}

 data class Produto(val nome: String, val preco: Double){
     fun desconto(percentual: Double): Produto {
         val novoPreco = preco - (preco * percentual / 100)
         return copy(preco = novoPreco)
     }
 }
