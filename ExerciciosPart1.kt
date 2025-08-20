
fun main() {
    val exercicios = mutableListOf<String>()
    
    exercicios.add(informacoes("Vitas", 20, 1.80))
    exercicios.add(paresAteN(10).toString()) 
    exercicios.add("Nota 7:" + classificarNota(7.0) + " | Nota 4.76: " + classificarNota(4.76) + " | Nota 2.3: " + classificarNota(2.3) )
    exercicios.add(fatorial(5).toString())
    exercicios.add(tamanhoSeguro("Kotlin").toString())

    
    for ((i, ex) in exercicios.withIndex()) {
        println("Exercício ${i+1}: $ex")
    }
}

/* 
1) Variáveis e Tipos básicos
Declare variáveis para armazenar nome (String), idade (Int) e altura (Double).
 Implemente a função informacoes() que retorne uma string formatada no estilo:
 "Nome: X, Idade: Y, Altura: Z m"

fun main() {
    println(informacoes("João", 30, 1.75))
    // Saída esperada: Nome: João, Idade: 30, Altura: 1.75 m
}
*/
fun informacoes(nome: String, idade: Int, altura: Double) = "Nome: $nome, Idade: $idade, Altura: ${"%.2f".format(altura)} m"


/*
2) Coleções e Loops (ranges)
Implemente a função paresAteN(n: Int): List<Int> que retorne uma lista com todos os números pares de 0 até n (inclusive).
fun main() {
    println(paresAteN(10))
    // Saída esperada: [0, 2, 4, 6, 8, 10]
}
*/
fun paresAteN(n: Int): List<Int> {
    return (0..n).filter { it % 2 == 0 }
}


/*
3) Fluxo de controle
Implemente a função classificarNota(nota: Double): String que retorne:
"Aprovado" se a nota for >= 6.0
"Recuperação" se estiver entre 4.0 e 5.9
"Reprovado" caso contrário.

fun main() {
    println(classificarNota(7.5)) // Aprovado
    println(classificarNota(5.0)) // Recuperação
    println(classificarNota(3.0)) // Reprovado
}
*/
fun classificarNota(nota: Double): String {
    return when {
        nota >= 6.0 -> "Aprovado"
        nota >= 4.9 -> "Recuperação"
        else -> "Reprovado"
    }
}

/*
4) Funções
Implemente a função fatorial(n: Int): Long que calcule o fatorial de n usando loop.

fun main() {
    println(fatorial(5)) // 120
}
*/
fun fatorial(n: Int): Long {
    var resultado = 1L
    for (i in 1..n){
        resultado *= i
    }
    return resultado
}

/*
5) Segurança nula
Implemente a função tamanhoSeguro(texto: String?): Int que retorne o tamanho da string se ela não for nula ou 0 caso seja nula.

fun main() {
    println(tamanhoSeguro("Kotlin")) // 6
    println(tamanhoSeguro(null))     // 0
}
*/
fun tamanhoSeguro(texto: String?): Int{
    return texto?.length ?:0
}


