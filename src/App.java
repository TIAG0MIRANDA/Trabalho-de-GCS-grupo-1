import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private Scanner sc = new Scanner(System.in);
    private Userdata usuarios = new Userdata(); // usuarios serao guardados aqui
    private User usuarioAtual = null; // usuario logado no sistema
    private int totalTrocasDeclinadas = 0, totalTrocasAceitas = 0;

    private Lootboxdata lootboxes = new Lootboxdata(); // lootboxes

    String e, s;

    public void executar() {
        boolean a = true;
        while (a) {
            Clear.clear();

            System.out.println("BEM-VINDO AO SISTEMA DE TROCA DO TELEJOGO 2000");
            System.out.println("[0] Sair");
            System.out.println("[1] Login");
            System.out.println("[2] Cadastro");
            System.out.println("[3] Estatísticas");

            switch (sc.nextLine()) {
                case "0":

                    Clear.clear();

                    System.out.println("Obrigado por utilizar o sistema!");
                    a = false;
                    break;
                case "1":
                    Clear.clear();
                    login();
                    break;
                case "2":
                    Clear.clear();
                    cadastro();
                    break;
                case "3":
                    Clear.clear();
                    mostrarEstatisticas();
                    break;

                default:
                    Clear.clear();
                    System.out.println("Opcao invalida, digite qualquer tecla");
                    sc.nextLine();
                    break;
            }
        }
    }

    /**
     * Metodo de login, verificar documentacao dos metodos validaLogin() e login()
     * em Userdata.
     */
    public void login() {
        System.out.println("Digite seu e-mail: ");
        e = sc.nextLine();
        System.out.println("Digite sua senha: ");
        s = sc.nextLine();

        if (usuarios.validaLogin(e, s)) {
            usuarioAtual = usuarios.login(e, s);
            interfaceDoUsuario();
        } else {
            System.out.println("Login ou senha inválidos, tente novamente."
                    + "\nDigite qualquer tecla");
            sc.nextLine();
        }
    }

    /**
     * Metodo de cadastro de usuario
     */
    public void cadastro() {
        boolean ve = true; // para o loop do e-mail
        boolean vn = true; // para o loop do nome
        boolean vs = true; // para o loop da senha
        String n = "";
        String e = "";
        String s = "";

        // verificar se o nome de usuario nao esta em uso
        // TODO verificar se o nome de usuario e apropriado
        while (vn) {
            Clear.clear();

            System.out.println("Digite seu nome: ");
            n = sc.nextLine();
            if (usuarios.verificaNome(n)) {
                System.out.println("Este nome de usuario ja esta em uso, tente novamente."
                        + "\n Digite qualquer tecla");
                sc.nextLine();
            } else if (Censura.censura(n)) {

                System.out.println("O sistema nao aceita nomes ofensivos."
                        + "\n Digite qualquer tecla");
                sc.nextLine();

            } else {
                vn = false;
            }
        }

        // verificar se o e-mail nao esta em uso
        while (ve) {

            Clear.clear();

            System.out.println("Nome de usuario: " + n);
            System.out.println("Digite seu e-mail: ");
            e = sc.nextLine();
            if (usuarios.verificaEmail(e)) {
                System.out.println("Este E-mail ja esta em uso, tente novamente."
                        + "\n Digite qualquer tecla");
                sc.nextLine();
            } else {
                ve = false;
            }
        }

        // verificar se a senha tem um comprimento minimo
        while (vs) {

            Clear.clear();

            System.out.println("Nome de usuario: " + n);
            System.out.println("E-mail: " + e);
            System.out.println("Digite sua senha (Exatamente 6 digitos, apenas numeros):");
            s = sc.nextLine();
            if (s.length() != 6) {
                System.out.println("A senha nao possui exatamente 6 digitos" +
                        "\nDigite qualquer tecla.");
                sc.nextLine();
            } else {
                try {
                    Integer.parseInt(s);
                    vs = false;
                } catch (Exception ex) {
                    System.out.println("A senha deve ser composta apenas por numeros"
                            + "\nDigite qualquer tecla");
                    sc.nextLine();
                }

            }
        }

        System.out.println("Usuario criado com sucesso!");
        System.out.println("Nome de usuario: " + n);
        System.out.println("E-mail: " + e);

        usuarios.adicionar(new User(n, e, s, usuarios.getUserId()));

        System.out.println("Digite qualquer tecla para retornar a tela de login.");
        sc.nextLine();

    }

    public void detalharProposta() {
        ArrayList<Trade> propostas = usuarioAtual.getTrocasRecebidas();
        for (int i = 0; i < propostas.size(); i++) {
            System.out.println(i + ". " + propostas.get(i).getSender().getNome() + " | "
                    + propostas.get(i).getItemDesejado().getname());
        }

        if (!propostas.isEmpty()) {
            System.out.println("=== Escolha uma proposta: ===");
            while (true) {
                System.out.println("Digite o número da proposta escolhida: ");
                int number = sc.nextInt();
                if (number < propostas.size() && number >= 0) {
                    Trade propEscolhida = propostas.get(number);
                    System.out.println("Proposta esolhida: ");
                    System.err.println(
                            "|             Nome               |             Item               |   Preço   | Cod   |=========|             Nome               |             Item               |   Preço   | Cod   | Hora|     Data      |");
                    propEscolhida.verProposta();
                    System.out.println();
                    System.out.println("=== Você aceita a proposta? ===");
                    System.out.println("[1] Sim");
                    System.out.println("[2] Não");
                    number = sc.nextInt();
                    if (number == 1) {
                        propEscolhida.trocar();
                        totalTrocasAceitas++;
                    } else if (number == 2) {
                        propEscolhida.declinar();
                        totalTrocasDeclinadas++;
                    } else {
                        System.out.println("Número inválido, tente novamente!");
                        continue;
                    }
                    break;
                }
            }
        } else {
            System.out.println("Você não recebeu nenhuma proposta!");
        }

    }

    public void mostrarEstatisticas() {
        int totalUsuarios = usuarios.getTotalUsuarios();
        int totalItens = usuarios.sizemercado();
        double totalpreco = usuarios.getTotalpreco();
        int totalTrocasEsperando = usuarios.getTotalTrocasEsperando();

        System.out.println("=== Estatísticas do Sistema ===");
        System.out.println("Total de usuários cadastrados: " + totalUsuarios);
        System.out.println("Total de itens: " + totalItens);
        System.out.println("Total de preço: " + totalpreco);
        System.out.println("Total de troca aceitas: " + totalTrocasAceitas);
        System.out.println("Total de troca declinadas: " + totalTrocasDeclinadas);
        System.out.println("Total de troca aguardando respostas: " + totalTrocasEsperando);
        System.out.println("Digite qualquer tecla para voltar.");
        sc.nextLine();
    }

    /**
     * A partir deste metodo o usuario ira interagir com o resto do sistema quando
     * logado
     */
    public void interfaceDoUsuario() {
        boolean a = true;
        while (a) {

            System.out.println("Ola, " + usuarioAtual.getNome() + "!");
            System.out.println("O que deseja fazer?");
            System.out.println("[0] Sair");

            Clear.clear();
            System.out.println("Ola, " + usuarioAtual.getNome() + "!");
            System.out.println("O que deseja fazer?");
            System.out.println("[0] Sair");
            System.out.println("[1] Ver seus items");
            System.out.println("[2] Ver o mercado de items");
            System.out.println("[3] Realizar uma busca");
            System.out.println("[4] Adcionar um item");
            System.out.println("[5] Excluir um item");
            System.out.println("[6] Fazer oferta de troca");
            System.out.println("[7] Listar propostas feitas");
            System.out.println("[8] Listar propostas recebidas");
            System.out.println("[9] Aceitar/declinar proposta");
            System.out.println("[10] Abrir Lootboxes");

            // TODO Inserir tudo que um usuario possa fazer enquanto logado

            switch (sc.nextLine()) {
                case "0":
                    a = false;
                    usuarioAtual = null; // deslogar o usuario
                    System.out.println("Obrigado por utilizar o sistema!"
                            + "\nDigite qualquer tecla.");
                    break;

                case "1":

                    Clear.clear();
                    usuarioAtual.ordenaitems();
                    usuarioAtual.inventarioprint(sc);
                    sc.nextLine();

                    break;

                case "2":
                    Clear.clear();
                    int pagina = 0;
                    while (pagina < usuarios.getPaginas()) {

                        usuarios.mercadoprint(pagina);

                        switch (sc.nextInt()) {
                            case 1:
                                if (pagina != 0) {

                                    pagina--;
                                }
                                break;

                            default:

                                pagina++;

                                break;
                        }

                    }

                    Clear.clear();

                    break;

                case "3":

                    Clear.clear();
                    System.out.println("Busca por:");
                    System.out.println("[1] Nome");
                    System.out.println("[2] Descricao");
                    System.out.println("[3] Categoria");
                    System.out.println("[4] Usuario");

                    switch (BetterScanner.scannerInt(sc)) {
                        case 1:

                            Clear.clear();

                            System.out.println("Digite o nome do item!");

                            String name;

                            do {

                                name = sc.nextLine();

                            } while (name.length() == 0);

                            Clear.clear();

                            usuarios.printabuscaitem(name, sc);

                            Clear.clear();

                            name = "";

                            break;

                        case 2:
                            Clear.clear();

                            System.out.println("Digite parte da descricao do item!");

                            String def;

                            do {

                                def = sc.nextLine();

                            } while (def.length() == 0);

                            Clear.clear();

                            usuarios.printabuscadef(def, sc);

                            Clear.clear();

                            break;

                        case 3:

                            Clear.clear();

                            System.out.println("Qual categoria?");
                            System.out.println("[1] Arma de Fogo");
                            System.out.println("[2] Defesa");
                            System.out.println("[3] Explosivo");
                            System.out.println("[4] Arma Branca");
                            System.out.println("[5] Tecnologia Militar");
                            System.out.println("[6] Equipamento");
                            System.out.println("[7] Munição");

                            String ctg;

                            do {

                                ctg = usuarios.getctg(BetterScanner.scannerInt(sc));

                            } while (ctg.length() == 0);

                            Clear.clear();
                            usuarios.printabuscactg(ctg, sc);
                            Clear.clear();

                            break;

                        default:
                            Clear.clear();
                            System.out.println("Digite o nome do usuario");

                            String user;

                            do {

                                user = sc.nextLine();

                            } while (user.length() == 0);

                            Clear.clear();

                            usuarios.printabuscaNome(user, sc);

                            Clear.clear();

                            break;
                    }

                    break;

                case "4":

                    Clear.clear();
                    boolean loop = false;
                    String nomeitem = "", defitem = "", itemctg = "";
                    double valitem = 0;

                    while (!loop) {
                        Clear.clear();
                        do {
                            System.out.printf("[1] nome do item %s\n", nomeitem);
                            nomeitem = sc.nextLine();
                            if (Censura.censura(nomeitem)) {
                                System.out.println("O sistema nao aceita nomes ofensivos."
                                        + "\n Digite qualquer tecla");
                                sc.nextLine();
                                nomeitem = "";
                            }
                            Clear.clear();
                        } while (nomeitem.length() <= 0);
                        Clear.clear();
                        do {
                            Clear.clear();
                            System.out.printf("[1] nome do item %s\n", nomeitem);
                            System.out.printf("[2] definição do item \n", defitem);
                            defitem = sc.nextLine();

                            if (Censura.censura(defitem)) {
                                System.out.println("O sistema nao aceita nomes ofensivos."
                                        + "\n Digite qualquer tecla");

                                sc.nextLine();
                                defitem = "";
                            }
                        } while (defitem.length() <= 0);

                        Clear.clear();
                        System.out.printf("[1] nome do item %s\n", nomeitem);
                        System.out.printf("[2] definição do item %s\n", defitem);
                        System.out.printf("[3] valor do item %f\n", valitem);
                        valitem = BetterScanner.scannerDouble(sc);
                        Clear.clear();
                        System.out.printf("[1] nome do item %s\n", nomeitem);
                        System.out.printf("[2] definição do item %s\n", defitem);
                        System.out.printf("[3] valor do item %f\n", valitem);
                        System.out.println("Digite algo para ir para escolha de categoria");
                        sc.next();
                        Clear.clear();
                        System.out.println("Qual categoria?");
                        System.out.println("[1] Arma de Fogo");
                        System.out.println("[2] Defesa");
                        System.out.println("[3] Explosivo");
                        System.out.println("[4] Arma Branca");
                        System.out.println("[5] Tecnologia Militar");
                        System.out.println("[6] Equipamento");
                        System.out.println("[7] Munição");

                        itemctg = usuarios.getctg(BetterScanner.scannerInt(sc));
                        Clear.clear();
                        System.out.printf("[1] nome do item - %s\n", nomeitem);
                        System.out.printf("[2] definição do item - %s\n", defitem);
                        System.out.printf("[3] valor do item - %f\n", valitem);
                        System.out.printf("[4] categoria - %s\n", itemctg);
                        System.out.println("Para confirmar digite 1");
                        System.out.println("Para cancelar digite 2");

                        if (BetterScanner.scannerInt(sc) == 1) {
                            loop = usuarios.additemto(nomeitem, defitem, valitem, usuarioAtual.getId(), itemctg);
                            usuarioAtual = usuarios.login(e, s);
                            usuarioAtual.ordenaitems();

                        } else {

                            loop = true;
                            nomeitem = "";
                            defitem = "";
                            itemctg = "";
                            valitem = 0;

                        }
                    }
                    break;
                case "6":
                    Clear.clear();
                    Trade ofertaTroca;
                    Item quer, oferta;// Itens que o usuário quer e o que ele vai dar em troca
                    int codQuer, codOferta;// Codigo do item que o usuário quer e o que ele vai dar em troca
                    User remetente, destinatario;// User remetente IOW:O usuário atual esperançosamente
                    // e Destinatario é o user da pessoa que tem o item desejado
                    while (true) {

                        Clear.clear();
                        System.out.print("Insira o código do item que deseja adquirir:");
                        codQuer = sc.nextInt();
                        System.out.println(
                                "|              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");
                        usuarios.getowner(codQuer).getItem(codQuer).itemPrint();
                        System.out.println("Confirma digite 1,selecionar outro item digite 2");
                        if (BetterScanner.scannerInt(sc) == 1) {
                            break;
                        }

                    }

                    while (true) {
                        Clear.clear();
                        System.out.println("Insira o código do item que deseja adquirir:" + codQuer);
                        System.out.println(
                                "|              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");
                        usuarios.getowner(codQuer).getItem(codQuer).itemPrint();
                        System.out.print("Insira o código do item que deseja oferecer em troca:");
                        codOferta = sc.nextInt();
                        System.out.println(
                                "|              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");
                        usuarios.getowner(codOferta).getItem(codOferta).itemPrint();
                        System.out.println("Confirma digite 1,selecionar outro item digite 2");
                        if (BetterScanner.scannerInt(sc) == 1) {
                            break;
                        }
                    }

                    remetente = usuarios.getowner(codOferta);
                    if (remetente == usuarioAtual) {
                        destinatario = usuarios.getowner(codQuer);
                        quer = destinatario.getItem(codQuer);
                        oferta = remetente.getItem(codOferta);
                        ofertaTroca = new Trade(oferta, quer, remetente, destinatario);

                        usuarios.addpedidoTrocato(ofertaTroca, usuarios.getUserIndexbyId(usuarioAtual.getId()));
                        usuarios.addsolicitacaoTrocato(ofertaTroca, destinatario.getId());
                        usuarioAtual = usuarios.login(e, s);
                    }

                    else {
                        // Caso o item que o usuário tente fazer a troca usando o código de um item que
                        // não é dele.
                    }
                    break;

                case "5":
                    Clear.clear();
                    System.out.print("digite o codigo do item a ser deletado:");
                    int c = BetterScanner.scannerInt(sc);
                    if (usuarioAtual.id == usuarios.getowner(c).getId()) {
                        Clear.clear();
                        System.out.println(
                                "|              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");
                        usuarioAtual.getItem(c).itemPrint();
                        System.out.println("Confirma a exclusao do item? digite 1");
                        System.out.println("Caso contrario digite 2");
                        if (BetterScanner.scannerInt(sc) == 1) {
                            usuarioAtual.deleteItem(c);
                        }
                    } else {
                        System.out.println("O voce nao tem um item com esse codigo!");
                        System.out.println("digite algo para voltar");
                        sc.next();
                    }

                    break;

                case "7":
                    Clear.clear();
                    usuarioAtual.listarTrocasFeitas();
                    sc.nextLine();
                    break;

                case "8":
                    Clear.clear();
                    usuarioAtual.listarTrocasRecebidas();
                    sc.nextLine();
                    break;
                case "9":
                    Clear.clear();
                    detalharProposta();
                    sc.nextLine();
                    break;
                case "10":
                    Clear.clear();
                    verLootboxes();
                    break;
                default:
            }
        }
    }

    public void verLootboxes() {
        boolean a = true;
        Item temp = null;
        while (a) {
            Clear.clear();
            System.out.println("Digite qual lootbox deseja abrir: ");
            System.out.println("[1] Itens Comuns");
            System.out.println("[2] Itens Tecnológicos");
            System.out.println("[3] Itens raros");
            System.out.println("[4] Itens lendários");
            System.out.println("[0] Voltar");
            switch (sc.nextLine()) {
                case "1":
                    temp = lootboxes.getLootboxes().get(0).abrir();
                    System.out.println("Voce recebeu: " + temp.getname());
                    System.out.println("Digite qualquer tecla. ");
                    sc.nextLine();
                    usuarios.additemto(temp.getname(), temp.getdef(),
                            temp.getprice(), usuarioAtual.getId(),
                            temp.getctg());
                    a = false;
                    break;
                case "2":
                    temp = lootboxes.getLootboxes().get(1).abrir();
                    System.out.println("Voce recebeu: " + temp.getname());
                    System.out.println("Digite qualquer tecla. ");
                    sc.nextLine();
                    usuarios.additemto(temp.getname(), temp.getdef(),
                            temp.getprice(), usuarioAtual.getId(),
                            temp.getctg());
                    a = false;
                    break;
                case "3":
                    temp = lootboxes.getLootboxes().get(2).abrir();
                    System.out.println("Voce recebeu: " + temp.getname());
                    System.out.println("Digite qualquer tecla. ");
                    sc.nextLine();
                    usuarios.additemto(temp.getname(), temp.getdef(),
                            temp.getprice(), usuarioAtual.getId(),
                            temp.getctg());
                    a = false;
                    break;
                case "4":
                    temp = lootboxes.getLootboxes().get(3).abrir();
                    System.out.println("Voce recebeu: " + temp.getname());
                    System.out.println("Digite qualquer tecla. ");
                    sc.nextLine();
                    usuarios.additemto(temp.getname(), temp.getdef(),
                            temp.getprice(), usuarioAtual.getId(),
                            temp.getctg());
                    a = false;
                    break;
                case "0":
                    a = false;
                    break;
                default:
                    break;
            }
        }
    }

}
