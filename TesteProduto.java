public class TesteProduto {
    public static void main(String[] args) {
        // Criando alguns objetos Produto
        Produto produtoA = new Produto("Tablet", 1000.0, 10);
        Produto produtoB = new Produto("Carregador", 50.0, 20);

        imprimirDetalhes(produtoA);
        imprimirDetalhes(produtoB);

        produtoA.adicionarEstoque(10);
        produtoB.adicionarEstoque(15);

        imprimirDetalhes(produtoA);
        imprimirDetalhes(produtoB);

        produtoA.removerEstoque(3);
        produtoB.removerEstoque(9);

        imprimirDetalhes(produtoA);
        imprimirDetalhes(produtoB);
    }

    public static void imprimirDetalhes(Produto produto) {
        System.out.println("DETALHES DO PRODUTO");
        System.out.println("Nome: " + produto.getNomeProduto());
        System.out.println("Preço Unitário: " + produto.getPrecoUnitarioProduto());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoqueProduto());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-");
    }
}
