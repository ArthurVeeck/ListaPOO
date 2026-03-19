
package exercicio04;


public class Exercicio04 {

    
    public static void main(String[] args) {
        FuncionarioEmpresa objFun = new FuncionarioEmpresa("Roberto", "Estagiario", 2000, "Medico");
        System.out.println(objFun.getNome());
        System.out.println(objFun.getCargo());
        System.out.println("_____________________________________");
        
        objFun.setNome("Carlos");
        objFun.setCargo("Gerente");
        System.out.println(objFun.getNome());
        System.out.println(objFun.getCargo());
        System.out.println("_____________________________________");
        
        objFun.setNome("Paulo");
        objFun.setCargo("Supervisor");
        System.out.println(objFun.getNome());
        System.out.println(objFun.getCargo());
    }
}
