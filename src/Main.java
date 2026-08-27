public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana", "111.111.111-11");
        Cliente bruno = new Cliente("Bruno", "222.222.222-22");

        ContaBancaria contaAna = new ContaBancaria(1001, ana);
        ContaBancaria contaBruno = new ContaBancaria(1002, bruno);

        contaAna.depositar(1000.0);
        contaAna.sacar(150.0);
        contaAna.transferir(contaBruno, 250.0);

        contaAna.exibirResumo();
        contaBruno.exibirResumo();
    }
}
