public class App {
    private User user;

    public void executar(){
        
    }

    public void detalharProposta(){
        //Tudo feito supondo que a proposta não tem toString
        System.out.println("-------ESCOLHA UMA PROPOSTA-------");
        System.out.println("Propostas recebidas: ");
        Proposta[] p = user.getPropRecebidas();
        for(int i=0;i<p.length;i++){
            System.out.println("Proposta número "+i+1+" :");
            System.out.println("De jogador "+p.getUser1().getNome());
        }
        System.out.println("Digite o número da proposta escolhida: ");
        int numeroProposta = scan.nextInt();
        Proposta propostaEscolhida = p[numeroProposta-1];

        System.out.println("Proposta "+numeroProposta+" :");
        System.out.println("Jogador requerente: "+propostaEscolhida.getUser1().getNome());
        System.out.println("Jogador destinatário: "+propostaEscolhida.getUser2().getNome());
        System.out.println("Item proposto: "+propostaEscolhida.getItem1().getNome());
        System.out.println("Item pedido: "+propostaEscolhida.getItem2().getNome());

        System.out.println("Você aceita ou declina a proposta? ");
        System.out.println("(Digite 'sim' para aceitar e 'não' para declinar)");
        String resposta = scan.next();
        if(resposta.equalsIgnoreCase("sim")){
            trocar();
            System.out.println("Troca realizada!");
        }else if(resposta.equalsIgnoreCase("não")){
            declinar();
            System.out.println("Proposta declinada!");
        }
    }
}
