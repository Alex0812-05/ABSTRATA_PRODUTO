public class ProdutoVestuario extends Produto {
    
    //Atributos utilizados para a classe ProdutoVestuario
    public String tamanho;
    public String cor;
    public String material;

    //Construtor da classe ProdutoVestuario, utilizando os atributos preço de custo, preço de venda, tamanho, cor e material
    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }
}
