
package exercicio09;


public class Exercicio09 {

    
    public static void main(String[] args) {
        PedidoRestaurante objPedido = new PedidoRestaurante("Arthur", "Strogonoff", "Pepsi", 40);
        objPedido.setBebida("Coca-Cola");
        System.out.println(objPedido.getNomeCliente());
        System.out.println(objPedido.getPrato());
        System.out.println(objPedido.getBebida());
        System.out.println(objPedido.getValorTotal());
    }
}
