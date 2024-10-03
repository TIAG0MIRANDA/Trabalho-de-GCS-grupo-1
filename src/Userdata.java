import java.util.ArrayList;

/**
 * Armazenamento de usuarios
 */
public class Userdata {
    private ArrayList<User> usuarios;


    public Userdata(ArrayList<User> usuarios) {
        this.usuarios = usuarios;
        usuarios.add(new User("Admin","admin@email.com","admin",0));
        usuarios.add(new User("Pedro","pedro@email.com","senha",1));
        usuarios.add(new User("Mario","mario@email.com","123345",2));
        usuarios.add(new User("Ana","ana@email.com","12412",3));
        usuarios.add(new User("Joao","Joao@email.com","465847",4));
        usuarios.add(new User("Daniel","pedro@email.com","af48n4uv",5));
        usuarios.add(new User("Leandra","pedro@email.com","ub4uni1@",6));
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

}
