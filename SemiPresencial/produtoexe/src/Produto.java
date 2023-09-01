public class Produto {
        private String nome;
        private Double valor;
        private String descricao;

        public Produto(String nome, Double valor, String descricao) {
            this.nome = nome;
            this.valor = valor;
            this.descricao = descricao;
        }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
