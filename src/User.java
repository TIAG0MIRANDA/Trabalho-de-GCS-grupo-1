import java.util.ArrayList;

public class User {
    private String nome, email, senha;
    public int id;

    private ArrayList<Item> inventario; //colocar itens aqui


    public User(String nome, String email, String senha, int id) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = id;
        //Ideia: metodo para adicionar itens aleatorios na criacao de usuario
        //randomizaitens();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Item> getInventario() {
        return inventario;
    }
}
