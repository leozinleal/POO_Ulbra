import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList();
        lista.add(20.0);
        lista.add(10.0);

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();

        Calculadora calculadora = new CalculadoraBasica();

        calculadora.calcular(soma, lista);
        System.out.println(calculadora.getResultado());
        calculadora.calcular(subtracao, lista);
        System.out.println(calculadora.getResultado());
    }
}