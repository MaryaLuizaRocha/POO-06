public class Produto {
    private String nomeProduto;
    private double precoUnitarioProduto;
    private int quantidadeEmEstoqueProduto;

    public Produto(String nomeProduto, double precoUnitarioProduto, int quantidadeEmEstoqueProduto) {
        this.nomeProduto = nomeProduto;
        this.precoUnitarioProduto = precoUnitarioProduto;
        this.quantidadeEmEstoqueProduto = quantidadeEmEstoqueProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getPrecoUnitarioProduto() {
        return precoUnitarioProduto;
    }
    public void setPrecoUnitarioProduto(double precoUnitarioProduto) {
        this.precoUnitarioProduto = precoUnitarioProduto;
    }
    public int getQuantidadeEmEstoqueProduto() {
        return quantidadeEmEstoqueProduto;
    }
    public void setQuantidadeEmEstoqueProduto(int quantidadeEmEstoqueProduto) {
        this.quantidadeEmEstoqueProduto = quantidadeEmEstoqueProduto;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEmEstoqueProduto += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= this.quantidadeEmEstoqueProduto) {
            this.quantidadeEmEstoqueProduto -= quantidade;
        } else {
            System.out.println("Quantidade desejada indisponível em estoque.");
        }
    }
}

