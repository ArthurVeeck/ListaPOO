
package exercicio07;


public class Exercicio07 {

    
    public static void main(String[] args) {
        AlunoCurso objAlu = new AlunoCurso("Arthur", "TI", 3, "98898989");
        System.out.println(objAlu.getNome());
        System.out.println(objAlu.getCurso());
        
        System.out.println("___________________________________________________");
        
        objAlu.setNome("Henrique");
        System.out.println(objAlu.getNome());
        System.out.println(objAlu.getCurso());
    }
}
