import java.util.ArrayList;

public class User {
    private String nome, email, senha;
    public int id;

    private ArrayList<Item> inventario = new ArrayList<>();


    public User(String nome, String email, String senha, int id, ArrayList<Item> inventario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = id;
        this.inventario = inventario;
    }
}
