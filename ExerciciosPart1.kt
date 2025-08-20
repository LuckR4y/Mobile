
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

//1) Variáveis e Tipos básicos
fun informacoes(nome: String, idade: Int, altura: Double) = "Nome: $nome, Idade: $idade, Altura: ${"%.2f".format(altura)} m"


//2) Coleções e Loops (ranges)
fun paresAteN(n: Int): List<Int> {
    return (0..n).filter { it % 2 == 0 }
}


//3) Fluxo de controle
fun classificarNota(nota: Double): String {
    return when {
        nota >= 6.0 -> "Aprovado"
        nota >= 4.9 -> "Recuperação"
        else -> "Reprovado"
    }
}

//4) Funções
fun fatorial(n: Int): Long {
    var resultado = 1L
    for (i in 1..n){
        resultado *= i
    }
    return resultado
}

//5) Segurança nula
fun tamanhoSeguro(texto: String?): Int{
    return texto?.length ?:0
}


