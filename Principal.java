public class Principal {
    public static void main(String[] args) {

        //Criando um objeto para instanciar o Produto Alimenticio
        //Depois realizar a impressão do programa com System.out.println
        final ProdutoAlimenticio pa = new ProdutoAlimenticio ("Arroz", 5.00, 7.50, "10/2024", "500 kcal por porção");
        System.out.println("Nome: " + pa.nome);
        System.out.println("Lucro: R$ " + pa.calcularLucro());
        System.out.println("Data de validade: " + pa.dataValidade);

        //Criando um objeto para instanciar o Produto Vestuario
        //Depois realizar a impressão do programa com System.out.println
        ProdutoVestuario pv = new ProdutoVestuario("Camiseta", 20.00, 35.00, "M", "Preto", "Algodão");
        System.out.println("Nome: " + pv.nome);
        System.out.println("Lucro: R$ " + pv.calcularLucro());
    
    }
}
