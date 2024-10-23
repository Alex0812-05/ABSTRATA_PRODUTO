public class ProdutoAlimenticio extends Produto {
    
    //Atributos utilizados para a classe ProdutoAlimenticio
    public String dataValidade;
    public String infoNutricionais;

    //Construtor para a utilização dos atributos nome, preço de custo, preço de venda, data de validade e informações nutricionais
    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String infoNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.infoNutricionais = infoNutricionais;
    }
}
