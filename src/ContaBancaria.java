public class ContaBancaria {
    private int numero;
    private Cliente titular;
    private double saldo;

    public ContaBancaria(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }

        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado.%n", valor);
        return true;
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência concluída.");
        }
    }

    public void exibirResumo() {
        System.out.printf(
            "Conta %d | Titular: %s | Saldo: R$ %.2f%n",
            numero, titular.getNome(), saldo
        );
    }
}
