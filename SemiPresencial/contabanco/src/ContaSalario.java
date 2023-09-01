public class ContaSalario extends Conta{

    @Override
    public void transferir(float valor, Conta destino) {
        System.out.println("Não se pode transferir nesse tipo de conta");
    }
}
