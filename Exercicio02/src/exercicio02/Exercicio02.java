
package exercicio02;


public class Exercicio02 {

    
    public static void main(String[] args) {
        LivroBiblioteca objLivro = new LivroBiblioteca("A batalha dos carecas", "Arthur Veeck", 50, 2025);
        objLivro.setAnoPublicacao(2026);
        System.out.println("Titulo: " + objLivro.getTitulo() + "\n"
        + "Autor: " + objLivro.getAutor() + "\n"
        + "Numero de paginas: " + objLivro.getNumeroPaginas() + "\n"
        + "Ano de publicacao: " + objLivro.getAnoPublicacao());
    }
    
}
