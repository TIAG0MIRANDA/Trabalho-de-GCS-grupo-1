import java.util.ArrayList;

public class Lootbox {
    private ArrayList<Item> itens= new ArrayList<>();
    private String nome;

    public Lootbox(String nome){
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

    /**
     * Adiciona um item na lootbox
     * @param item Item a ser adicionado
     */
    public void inserir(Item item){
        itens.add(item);
    }
}
