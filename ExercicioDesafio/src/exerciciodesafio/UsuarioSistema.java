
package exerciciodesafio;


public class UsuarioSistema {
    private String nome;
    private String email;
    private String senha;
    private String nivelAcesso;

    public UsuarioSistema(String nome, String email, String senha, String nivelAcesso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() >= 6) {
            this.senha = senha;
        } else {
            System.out.println("Senha deve ter no minimo 6 caracteres!");
        }
    }
    
    public String getNivelAcesso(){
        return nivelAcesso;
    }
    
    public void setNivelAcesso(String nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }
}
