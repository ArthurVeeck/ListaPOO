
package exerciciodesafio;


public class ExercicioDesafio {

    
    public static void main(String[] args) {
        UsuarioSistema objUsuario = new UsuarioSistema("Arthur", "arthur151617@gmail.com", "@A2000", "Restrito");
        System.out.println(objUsuario.getNome());
        System.out.println(objUsuario.getEmail());
        System.out.println(objUsuario.getSenha());
        System.out.println(objUsuario.getNivelAcesso());
    }
}
