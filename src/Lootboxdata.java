import java.util.ArrayList;

/**
 * Armazenamento de lootboxes
 */
public class Lootboxdata {
    private ArrayList<Lootbox> lootboxes = new ArrayList<>();

    public Lootboxdata() {
        lootboxes.add(new Lootbox("Itens Comuns"));
        lootboxes.get(0).inserir(new Item("Pistola de 9mm",
                "Uma arma de fogo compacta, fácil de usar e ideal para defesa pessoal.",
                300.00, 0, "Arma de Fogo"));
        lootboxes.get(0).inserir(new Item("Colete à Prova de Balas",
                "Oferece proteção contra disparos de armas de fogo.",
                200.00, 0, "Defesa"));
        lootboxes.get(0).inserir(new Item("Granada de Fragmentação",
                "Explosivo que dispersa estilhaços em uma ampla área.",
                150.00, 0, "Explosivo"));
        lootboxes.get(0).inserir(new Item("Facão Tático",
                "Uma arma branca robusta, ideal para combate corpo a corpo e sobrevivência.",
                80.00, 0, "Arma Branca"));
        lootboxes.get(0).inserir(new Item("Radio Multifrequência",
                "Equipamento básico para comunicação em campo de batalha.",
                250.00, 0, "Tecnologia Militar"));

        lootboxes.add(new Lootbox("Itens Tecnológicos"));
        lootboxes.get(1).inserir(new Item("Câmera de Vigilância",
                "Permite monitorar áreas remotamente com visão noturna.",
                100.00, 0, "Equipamento"));
        lootboxes.get(1).inserir(new Item("Drone de Reconhecimento",
                "Um pequeno drone que mapeia e coleta informações do terreno.",
                250.00, 0, "Tecnologia Militar"));
        lootboxes.get(1).inserir(new Item("Computador Portátil",
                "Um dispositivo leve e poderoso para trabalho e entretenimento em movimento.",
                500.00, 0, "Tecnologia Militar"));
        lootboxes.get(1).inserir(new Item("Relógio Espião",
                "Monitora atividades e recebe notificações do alto-comando.",
                150.00, 0, "Tecnologia Militar"));
        lootboxes.get(1).inserir(new Item("Kit de Primeiros Socorros Avançado",
                "Contém suprimentos médicos e equipamentos para emergências.",
                50.00, 0, "Consumível"));

        lootboxes.add(new Lootbox("Itens raros"));
        lootboxes.get(2).inserir(new Item("Escudo Tático Reforçado",
                "Um escudo leve, mas extremamente resistente, projetado para suportar impactos de alta velocidade.",
                1200.00, 0, "Defesa"));
        lootboxes.get(2).inserir(new Item("Bomba de Pulso Eletromagnético",
                "Explosivo que desativa eletrônicos em uma área ampla, causando caos em comunicações inimigas.",
                3000.00, 0, "Explosivo"));
        lootboxes.get(2).inserir(new Item("Munição Perfuro-Explosiva",
                "Balas especiais projetadas para penetrar blindagens e causar explosões internas.",
                100.00, 0, "Munição"));
        lootboxes.get(2).inserir(new Item("Adaga Tática de Combate",
                "Uma arma branca de lâmina dupla, ideal para furtividade e combate corpo a corpo.",
                1000.00, 0, "Arma Branca"));
        lootboxes.get(2).inserir(new Item("Fuzil de Precisão CobTac K200",
                "Um rifle de longo alcance, projetado para atiradores de elite, com precisão excepcional.",
                6000.00, 0, "Arma de Fogo"));

        lootboxes.add(new Lootbox("Lendários"));
        lootboxes.get(3).inserir(new Item("Bomba de Tempestade",
                "Um explosivo devastador que cria uma tempestade de fogo e eletricidade em uma área ampla.",
                12000.00, 0, "Explosivo"));
        lootboxes.get(3).inserir(new Item("Recombobulador",
                "Um dispositivo avançado que reconfigura e otimiza matéria a um nível atômico, melhorando sua eficiência e desempenho.",
                5000.00, 0, "Tecnologia Militar"));
        lootboxes.get(3).inserir(new Item("Urso de brinquedo",
                "Um urso de pelúcia, com aparência fofa, mas que esconde grande poder.",
                1000000.00, 0, "Explosivo"));
        lootboxes.get(3).inserir(new Item("Rifle de Assalto Excalibur",
                "Uma arma de fogo mítica, com precisão sobrenatural e capacidade de desferir tiros que perfuram qualquer armadura.",
                10000.00, 0, "Arma de Fogo"));
        lootboxes.get(3).inserir(new Item("Escudo de Aegis",
                "Um escudo lendário que reflete qualquer tipo de ataque, proporcionando proteção incomparável.",
                8000.00, 0, "Defesa"));
    }

    public ArrayList<Lootbox> getLootboxes() {
        return lootboxes;
    }
}
