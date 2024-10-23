public class Produto {

    //Atributos da classe Produto
    public String nome;
    public double precoCusto;
    public double precoVenda;

    //Construção da classe Produto, com os atributos nome, preço de custo e preço de venda
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    //Construtor para calcular o lucro da Classe Produto
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }
}
