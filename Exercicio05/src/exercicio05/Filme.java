
package exercicio05;


public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;
    private String classificacao;

    public Filme(String titulo, String diretor, int duracao, String classificacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        }
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
