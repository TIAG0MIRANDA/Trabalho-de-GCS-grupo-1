import java.util.ArrayList;

public class SistemaTroca {

    public static void listarTrocasDoJogador(User jogadorLogado) {
        ArrayList<Troca> trocas = jogadorLogado.getTrocas();

        if (trocas.isEmpty()) {
            System.out.println("Nenhuma troca pendente para o jogador: " + jogadorLogado.getname());
            return;
        }

        System.out.println("Propostas de troca para o jogador: " + jogadorLogado.getname());
        System.out.println("| Solicitante | Item Solicitante | Preço Item Solicitante | Solicitado | Item Solicitado | Preço Item Solicitado | Código |");

        
        for (Troca troca : trocas) {
            User solicitante = Data.getUserById(troca.getidsolicitante());
            User solicitado = Data.getUserById(troca.getidsolicitado());
            Item itemSolicitante = solicitante.getitembycod(troca.getiditemsolicitante());
            Item itemSolicitado = solicitado.getitembycod(troca.getiditemsolicitado());

            System.out.printf("| %s | %s | %.2f | %s | %s | %.2f | %d |\n",
                    solicitante.getname(),
                    itemSolicitante.getname(),
                    itemSolicitante.getprice(),
                    solicitado.getname(),
                    itemSolicitado.getname(),
                    itemSolicitado.getprice(),
                    troca.getcode()
            );
        }
    }
}