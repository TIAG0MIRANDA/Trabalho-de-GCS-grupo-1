import java.util.ArrayList;

/**
 * Armazenamento de usuarios
 */
public class Userdata {
    private ArrayList<User> usuarios = new ArrayList<>();


    public Userdata() {
        usuarios.add(new User("Admin","admin@email.com","123456"));
        usuarios.add(new User("Pedro","pedro@email.com","654321"));
        usuarios.add(new User("Mario","mario@email.com","234567"));
        usuarios.add(new User("Ana","ana@email.com","098765"));
        usuarios.add(new User("Joao","Joao@email.com","528529"));
        usuarios.add(new User("Daniel","pedro@email.com","974168"));
        usuarios.add(new User("Leandra","pedro@email.com","876543"));
    }

    /**
     * Valida o login
     * @param email e-mail de login
     * @param senha a senha
     * @return true caso o e-mail exista e a senha esteja correta, false caso contrario.
     */
    public boolean validaLogin(String email, String senha) {
        for (User user : usuarios) {
            if(email.equals(user.getEmail()) && senha.equals(user.getSenha())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Este metodo deve ser chamado apenas apos o validaLogin()
     * @param email e-mail de login (validado em validaLogin())
     * @param senha senha (validado em validaLogin())
     * @return O usuario a ser acessado ou null caso utilizado incorretamente
     */
    public User login(String email, String senha) {
        for (User user : usuarios) {
            if(email.equals(user.getEmail()) && senha.equals(user.getSenha())) {
                return user;
            }
        }
        return null; //se tudo der certo jamais chegaremos aqui
    }

    /**
     * Verifica se o e-mail ja esta em uso
     * @param email e-mail a ser verificado
     * @return true se o e-mail ja esta em uso
     */
    public boolean verificaEmail(String email) {
        for (User user : usuarios) {
            if(email.equals(user.getEmail())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se o nome de usuario ja esta em uso
     * @param nome Nome de usuario a ser verificado
     * @return True se o nome de usuario ja esta em uso
     */
    public boolean verificaNome(String nome){
        for (User user : usuarios) {
            if(nome.equals(user.getNome())) {
                return true;
            }
        }
        return false;
    }

    public void adicionar(User u){
        usuarios.add(u);
    }
}
