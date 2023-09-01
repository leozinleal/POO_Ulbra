public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente2 = new ContaCorrente();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaSalario contasalario = new ContaSalario();
        contasalario.transferir(1000, contaCorrente);
        contaCorrente.saldo = 1000;
        contaCorrente2.saldo = 1200;
        contaCorrente2.transferir(100, contaCorrente);
        contaCorrente.ConsultarSaldo();
        contaCorrente2.ConsultarSaldo();

    }
}