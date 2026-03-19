
package exercicio03;


public class Exercicio03 {

    
    public static void main(String[] args) {
        Computador objComputador = new Computador("Acer", "Intel QuadCore N3450", 4, 1200);
        objComputador.setPreco(1000);
        System.out.println(objComputador.getMarca());
        System.out.println(objComputador.getProcessador());
        System.out.println(objComputador.getMemoriaRAM());
        System.out.println(objComputador.getPreco());
    }
    
}
