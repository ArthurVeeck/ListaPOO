
package exercicio05;


public class Exercicio05 {

    
    public static void main(String[] args) {
        Filme objFilme = new Filme("Panico 7", "Kevin Williamson", 154, "18 anos");
        objFilme.setClassificacao("Livre");
        System.out.println(objFilme.getTitulo());
        System.out.println(objFilme.getDiretor());
        System.out.println(objFilme.getDuracao());
        System.out.println(objFilme.getClassificacao());
    }
}
