
package exercicio06;


public class Exercicio06 {

    
    public static void main(String[] args) {
        ContaEnergia objConta = new ContaEnergia("Arthur", "87820", 100, 700);
        System.out.println(objConta.getNomeCliente());
        System.out.println(objConta.getNumeroInstalacao());
        System.out.println(objConta.getConsumoKwh());
        System.out.println(objConta.getValorConta());
        
        System.out.println("_______________________________");
        
        objConta.setConsumoKwh(120);
        System.out.println("Consumo atualizado: " + objConta.getConsumoKwh());
    }
}
