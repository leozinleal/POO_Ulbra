import java.util.ArrayList;

public class Carrinho {

    private double valorTotal = 0.0;
    private final ArrayList<Produto> produtos = new ArrayList<>();
    public void adicionarAoCariinho(Produto produto){
        produtos.add(produto);
        this.valorTotal += produto.getValor();
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
