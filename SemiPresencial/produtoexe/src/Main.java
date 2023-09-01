public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("Notebook", 3500.00, "dellg15");
        Produto produto2 = new Produto("Celular", 5500.00, "iphone13");
        carrinho.adicionarAoCariinho(produto1);
        carrinho.adicionarAoCariinho(produto2);
        System.out.println(carrinho.getValorTotal());

    }
}
