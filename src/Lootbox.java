import java.util.ArrayList;

public class Lootbox {
    private ArrayList<Item> itens= new ArrayList<>();
    private String nome;

    public Lootbox(ArrayList<Item> itens, String nome) {
        this.itens = itens;
        this.nome = nome;
    }

    /**
     * "Abre" uma lootbox
     * @return Um item aleatorio pertencente a lootbox
     */
    public Item abrir(){
        int rand = (int) (Math.random() * itens.size());
        return itens.get(rand);
    }
}
