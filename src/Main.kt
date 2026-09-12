fun main() {
    val conta = ContaBancaria("Ronaldo Fenômeno")

    conta.depositar(1200.0)
    conta.sacar(500.0)

    println("O saldo de ${conta.titular} é de R\$${conta.buscarSaldo()}")
}