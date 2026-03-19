
package exercicio03;


public class Computador {
    private String marca;
    private String processador;
    private int memoriaRAM;
    private double preco;

    public Computador(String marca, String processador, int memoriaRAM, double preco) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }
    
    public void setProcessador(String processador){
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        if (memoriaRAM > 0) {
            this.memoriaRAM = memoriaRAM;
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
