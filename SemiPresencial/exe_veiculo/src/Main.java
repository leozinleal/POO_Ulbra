public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.modelo = "fusca";
        carro.marca = "volkswagen";
        carro.ano = 1966;
        carro.ligar();
        carro.acelerar();
        carro.desligar();
    }
}