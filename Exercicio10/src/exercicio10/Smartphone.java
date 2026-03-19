
package exercicio10;


public class Smartphone {
    private String modelo;
    private String fabricante;
    private int armazenamento;
    private double preco;

    public Smartphone(String modelo, String fabricante, int armazenamento, double preco) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.armazenamento = armazenamento;
        this.preco = preco;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getFabricante(){
        return fabricante;
    }
    
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        if (armazenamento > 0) {
            this.armazenamento = armazenamento;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
}
