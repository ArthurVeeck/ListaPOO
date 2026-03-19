
package exercicio06;


public class ContaEnergia {
    private String nomeCliente;
    private String numeroInstalacao;
    private double consumoKwh;
    private double valorConta;

    public ContaEnergia(String nomeCliente, String numeroInstalacao, double consumoKwh, double valorConta) {
        this.nomeCliente = nomeCliente;
        this.numeroInstalacao = numeroInstalacao;
        this.consumoKwh = consumoKwh;
        this.valorConta = valorConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public String getNumeroInstalacao(){
        return numeroInstalacao;
    }
    
    public void setNumeroInstalacao(String numeroInstalacao){
        this.numeroInstalacao = numeroInstalacao;
    }

    public double getConsumoKwh() {
        return consumoKwh;
    }

    public void setConsumoKwh(double consumoKwh) {
        if (consumoKwh >= 0) {
            this.consumoKwh = consumoKwh;
        }
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        if (valorConta >= 0) {
            this.valorConta = valorConta;
        }
    }
}
