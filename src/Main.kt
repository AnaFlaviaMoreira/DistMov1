fun main() {
    // Desafio 1: Comparar a igualdade de duas Strings
    val stringA = "Kotlin"
    val stringB = "Kotlin"
    if (stringA == stringB) {
        println("As strings são iguais.")
    } else {
        println("As strings são diferentes.")
    }

    // Desafio 2: Verificar se a idade permite dirigir
    val idade = 20
    if (idade >= 18) {
        println("Pode dirigir.")
    } else {
        println("Não pode dirigir.")
    }

    // Desafio 3: Verificar se a idade NÃO permite dirigir
    if (idade < 18) {
        println("Não pode dirigir.")
    } else {
        println("Pode dirigir.")
    }

    // Desafio 4: Verificar se é motorista OU tem 17 anos ou mais
    val motorista = true
    if (motorista || idade >= 17) {
        println("Condição atendida.")
    } else {
        println("Condição não atendida.")
    }

    // Desafio 5: Verificar se é motorista E tem mais de 30 anos
    if (motorista && idade > 30) {
        println("Condição atendida.")
    } else {
        println("Condição não atendida.")
    }

    // Desafio 6: Verificar produto e aplicar desconto
    val produto = "iMac"
    val preco = 12000.0
    if (produto == "iMac" && preco >= 10000) {
        val desconto = preco * 0.12
        val total = preco - desconto
        println("Desconto aplicado de 12%. Total a pagar: R$ $total")
    } else {
        println("Nenhum desconto aplicado.")
    }

    // Desafio 7: Verificar se é fim de semana ou dia útil
    val dia = "SAB"
    when (dia.uppercase()) {
        "SAB", "DOM" -> println("É fim de semana.")
        "SEG", "TER", "QUA", "QUI", "SEX" -> println("É dia útil.")
        else -> println("Erro: Dia inválido.")
    }
}