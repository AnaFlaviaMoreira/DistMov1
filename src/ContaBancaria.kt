class ContaBancaria(val titular: String) {
    private var saldo: Double = 0.0

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
        }
    }

    fun buscarSaldo(): Double {
        return saldo
    }
}