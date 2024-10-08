import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String nome, email, senha;
    public int id;

    private ArrayList<Item> inventory = new ArrayList<>();
    private ArrayList<Trade> trocasFeitas = new ArrayList<>();    
    private ArrayList<Trade> trocasRecebidas = new ArrayList<>(); 


    public void addTrocaFeita(Trade troca) {
    trocasFeitas.add(troca);
}

    public void addTrocaRecebida(Trade troca) {
    trocasRecebidas.add(troca);
}

    public void listarTrocasFeitas() {
    if (trocasFeitas.isEmpty()) {
        System.out.println("Nenhuma proposta de troca feita.");
    } else {
        for (Trade troca : trocasFeitas) {
            System.out.println("Proposta feita: " + troca.verProposta());
        }
    }
}

    public void listarTrocasRecebidas() {
    if (trocasRecebidas.isEmpty()) {
        System.out.println("Nenhuma proposta de troca recebida.");
    } else {
        for (Trade troca : trocasRecebidas) {
            System.out.println("Proposta recebida: " + troca.verProposta());
        }
    }
}

    

    public User(String nome, String email, String senha, int id) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = id;

        // Ideia: metodo para adicionar itens aleatorios na criacao de usuario
        // randomizaitens();
    }

    public void addItem(String name, String def, double val, int cod, String ctg) {

        inventory.add(new Item(name, def, val, cod, ctg));

    }

    public void inventarioprint() {

        System.out.println(
                "|              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");
        for (int i = 0; i < inventory.size(); i++) {

            inventory.get(i).itemPrint();
        }
        System.out.println("digite algo para voltar:");

    }

    public void ordenaitems() {

        String[] nomes = new String[inventory.size()];

        for (int i = 0; i < nomes.length; i++) {

            nomes[i] = inventory.get(i).getname().toUpperCase();

        }

        Arrays.sort(nomes);

        ArrayList<Item> temp = new ArrayList<>();

        for (int i = 0; i < nomes.length; i++) {

            for (int j = 0; j < nomes.length; j++) {

                if (nomes[i].equals(inventory.get(j).getname().toUpperCase())) {

                    temp.add(inventory.get(j));

                }

            }

        }

        this.inventory = temp;

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
        
        return inventory;
    }

    public Item getItem(int codItem) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getcod() == codItem) {
                return inventory.get(i);
            }
        }
        return null;

    }
}


