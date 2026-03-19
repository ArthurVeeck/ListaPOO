
package exercicio10;


public class Exercicio10 {

    
    public static void main(String[] args) {
        Smartphone objSmart = new Smartphone("Poco x5", "Xiaomi", 125, 3000);
        objSmart.setArmazenamento(200);
        System.out.println(objSmart.getModelo());
        System.out.println(objSmart.getFabricante());
        System.out.println(objSmart.getArmazenamento());
        System.out.println(objSmart.getPreco());
        
        System.out.println("_________________________________________________");
        
        Smartphone objPhone = new Smartphone("16 Pro Max", "Iphone", 1000, 15000);
        System.out.println(objPhone.getModelo());
        System.out.println(objPhone.getFabricante());
        System.out.println(objPhone.getArmazenamento());
        System.out.println(objPhone.getPreco());
    }
}
