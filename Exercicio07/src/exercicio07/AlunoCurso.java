
package exercicio07;


public class AlunoCurso {
    private String nome;
    private String curso;
    private int semestre;
    private String matricula;

    public AlunoCurso(String nome, String curso, int semestre, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        if (semestre > 0) {
            this.semestre = semestre;
        }
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
