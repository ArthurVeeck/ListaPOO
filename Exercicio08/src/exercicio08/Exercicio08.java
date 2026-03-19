
package exercicio08;


public class Exercicio08 {

    
    public static void main(String[] args) {
        CarroAluguel objCarro = new CarroAluguel("Tempra", "Fiat", 1996, 500);
        objCarro.setValorDiaria(600);
        System.out.println(objCarro.getModelo());
        System.out.println(objCarro.getMarca());
        System.out.println(objCarro.getAno());
        System.out.println(objCarro.getValorDiaria());
    }
}
