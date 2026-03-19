
package exercicioo01;


public class ProdutoTecnologia {
    private String nomeProduto;
    private String marca;
    private double preco;
    private int quantidadeEstoque;

    public ProdutoTecnologia(String nomeProduto, String marca, double preco, int quantidadeEstoque) {
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Estoque não pode ser negativo!");
        }
    }
    
    public void exibirProduto(){
        System.out.println("Nome do produto: "+ getNomeProduto() + "\n"
        + "Marca: " + getMarca() + "\n"
        + "Preco: " + getPreco() + "\n"
        + "Quantidade de estoque: " + getQuantidadeEstoque());
    }
}
