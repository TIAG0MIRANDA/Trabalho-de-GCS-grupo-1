import java.util.Scanner;
public class App {
    private Scanner sc = new Scanner(System.in);
    private Userdata usuarios = new Userdata(); //usuarios serao guardados aqui
    private User usuarioAtual = null; //usuario logado no sistema

    String e,s;

    public void executar(){
        boolean a = true;
        while(a){
            Clear.clear();
            System.out.println("BEM-VINDO AO SISTEMA DE TROCA DO TELEJOGO 2000");
            System.out.println("[0] Sair");
            System.out.println("[1] Login");
            System.out.println("[2] Cadastro");
            switch (sc.nextLine()){
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
                default:
                    Clear.clear();
                    System.out.println("Opcao invalida, digite qualquer tecla");
                    sc.nextLine();
                    break;
            }
        }
    }
 
    /**
     * Metodo de login, verificar documentacao dos metodos validaLogin() e login() em Userdata.
     */
    public void login(){
        System.out.println("Digite seu e-mail: ");
        e = sc.nextLine();
        System.out.println("Digite sua senha: ");
        s = sc.nextLine();
        if (usuarios.validaLogin(e, s)){
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
    public void cadastro(){
        boolean ve = true; //para o loop do e-mail
        boolean vn = true; //para o loop do nome
        boolean vs = true; //para o loop da senha
        String n = "";
        String e = "";
        String s = "";

        //verificar se o nome de usuario nao esta em uso
        //TODO verificar se o nome de usuario e apropriado
        while (vn){
            Clear.clear();
            System.out.println("Digite seu nome: ");
            n = sc.nextLine();
            if (usuarios.verificaNome(n)){
                System.out.println("Este nome de usuario ja esta em uso, tente novamente."
                                    + "\n Digite qualquer tecla");
                sc.nextLine();
            } else {
                vn = false;
            }
        }

        //verificar se o e-mail nao esta em uso
        while (ve){
            Clear.clear();
            System.out.println("Nome de usuario: " + n);
            System.out.println("Digite seu e-mail: ");
            e = sc.nextLine();
            if (usuarios.verificaEmail(e)){
                System.out.println("Este E-mail ja esta em uso, tente novamente."
                                    + "\n Digite qualquer tecla");
                sc.nextLine();
            } else {
                ve = false;
            }
        }

        //verificar se a senha tem um comprimento minimo
        while (vs){
            Clear.clear();
            System.out.println("Nome de usuario: " + n);
            System.out.println("E-mail: " + e);
            System.out.println("Digite sua senha (Exatamente 6 digitos, apenas numeros):");
            s = sc.nextLine();
            if (s.length() != 6){
                System.out.println("A senha nao possui exatamente 6 digitos" +
                                    "\nDigite qualquer tecla.");
                sc.nextLine();
            } else {
                try {
                    Integer.parseInt(s);
                    vs = false;
                } catch (Exception ex){
                    System.out.println("A senha deve ser composta apenas por numeros"
                                        + "\nDigite qualquer tecla");
                    sc.nextLine();
                }

            }
        }

        System.out.println("Usuario criado com sucesso!");
        System.out.println("Nome de usuario: " + n);
        System.out.println("E-mail: " + e);
        usuarios.adicionar(new User(n,e,s,usuarios.getUserId()));
        System.out.println("Digite qualquer tecla para retornar a tela de login.");
        sc.nextLine();

    }

    /**
     * A partir deste metodo o usuario ira interagir com o resto do sistema quando logado
     */
    public void interfaceDoUsuario(){
        boolean a = true;
        while(a){
            Clear.clear();
            System.out.println("Ola, " + usuarioAtual.getNome() + "!");
            System.out.println("O que deseja fazer?");
            System.out.println("[0] Sair");
            System.out.println("[1] Ver seus items");
            System.out.println("[2] Ver o mercado de items");
            System.out.println("[3] Realizar uma busca");
            System.out.println("[4] Adcionar um item");
            System.out.println("[5] Fazer oferta de troca");

            //TODO Inserir tudo que um usuario possa fazer enquanto logado

            switch (sc.nextLine()){
                case "0":
                    a = false;
                    usuarioAtual = null; //deslogar o usuario
                    System.out.println("Obrigado por utilizar o sistema!"
                            + "\nDigite qualquer tecla.");
                break;

                case "1":
                    
                    Clear.clear();
                    usuarioAtual.ordenaitems();
                    usuarioAtual.inventarioprint();
                    sc.nextLine();

                break;

                case "2":
                     Clear.clear();
                     int pagina = 0;
                     while(pagina <usuarios.getPaginas()){
                     
                         usuarios.mercadoprint(pagina);
                         
                         switch (sc.nextInt()) {
                             case 1:
                             if(pagina != 0){
                 
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
                    

                    switch (sc.nextInt()) {
                            case 1:

                                Clear.clear();
                                
                                System.out.println("Digite o nome do item!");
                                
                                String name;

                                do{

                                name = sc.nextLine();

                                }while(name.length() == 0);

                                Clear.clear();

                                usuarios.printabuscaitem(name);
                                System.out.println("Digite algo para voltar");
                                sc.next();
                               
                                Clear.clear();
                                
                            break;

                            case 2:
                                Clear.clear();
                                    
                                System.out.println("Digite parte da descricao do item!");
                                
                                String def; 
                                
                                do{

                                def = sc.nextLine();
    
                                }while(def.length() == 0);
    
                                Clear.clear();

                                usuarios.printabuscadef(def);
                                System.out.println("Digite algo para voltar");
                                sc.next();
                            
                                Clear.clear();
                                
                            break;

                            case 3:

                                Clear.clear();
                                    
                                System.out.println("Qual categoria?");
                                System.out.println("[1] Arma de Fogo");
                                System.out.println("[2] Defesa");
                                System.out.println("[3] Explosivo");
                                System.out.println("[4] Arma Branca");
                                System.out.println("[5] Defesa");
                                System.out.println("[6] Tecnologia Militar");
                                System.out.println("[7] Equipamento");
                                System.out.println("[8] Munição");
                                
                                
                                String ctg;
                                
                                do{

                                    ctg = usuarios.getctg(BetterScanner.scannerInt(sc));
    
                                }while(ctg.length() == 0);
    
                                Clear.clear();

                                usuarios.printabuscactg(ctg);
                                System.out.println("Digite algo para voltar");
                                sc.next();
                            
                                Clear.clear();
                               
                                
                            break;
                    
                            default:
                            Clear.clear();      
                            System.out.println("Digite o nome do usuario");
                            
                            String user;
                            
                            do{

                                user = sc.nextLine();

                            }while(user.length() == 0);


                            Clear.clear();

                            usuarios.printabuscaNome(user);
                            System.out.println("Digite algo para voltar");
                            sc.next();

                            Clear.clear();
                           
                            break;
                    }
                     
                break;

                case "4":

                Clear.clear();
                boolean loop = false;
                String nomeitem = "" , defitem = "", itemctg= "";
                double valitem = 0;

                while(!loop){
                    Clear.clear();
                    System.out.printf("[1] nome do item %s\n",nomeitem);
                    do{
                    nomeitem = sc.nextLine();
                    }while(nomeitem.length() <=0);
                    Clear.clear();
                    System.out.printf("[1] nome do item %s\n",nomeitem);
                    System.out.printf("[2] def do item \n",defitem);
                    defitem = sc.nextLine();
                    Clear.clear();
                    System.out.printf("[1] nome do item %s\n",nomeitem);
                    System.out.printf("[2] def do item %s\n",defitem);
                    System.out.printf("[3] valor do item %f\n",valitem);
                    valitem = BetterScanner.scannerDouble(sc);
                    Clear.clear();
                    System.out.printf("[1] nome do item %s\n",nomeitem);
                    System.out.printf("[2] def do item %s\n",defitem);
                    System.out.printf("[3] valor do item %f\n",valitem);
                    System.out.println("Digite algo para ir para escolha de categoria");
                    sc.next();
                    Clear.clear();
                    System.out.println("Qual categoria?");
                    System.out.println("[1] Arma de Fogo");
                    System.out.println("[2] Defesa");
                    System.out.println("[3] Explosivo");
                    System.out.println("[4] Arma Branca");
                    System.out.println("[5] Defesa");
                    System.out.println("[6] Tecnologia Militar");
                    System.out.println("[7] Equipamento");
                    System.out.println("[8] Munição");

                    itemctg = usuarios.getctg(BetterScanner.scannerInt(sc));
                    Clear.clear();
                    System.out.printf("[1] nome do item - %s\n",nomeitem);
                    System.out.printf("[2] def do item - %s\n",defitem);
                    System.out.printf("[3] valor do item - %f\n",valitem);
                    System.out.printf("[4] categoria - %s\n",itemctg);
                    System.out.println("Para confirmar digite 1");

                    if(BetterScanner.scannerInt(sc) == 1){
                    loop = usuarios.additemto(nomeitem,defitem,valitem,usuarioAtual.getId(),itemctg);
                    usuarioAtual = usuarios.login(e, s);
                    usuarioAtual.ordenaitems();
                   
                    }

                    else{

                        nomeitem = "";
                        defitem ="";
                        itemctg= "";
                        valitem = 0; 

                    }
                }
                break;
                case "5":
                    Clear.clear();
                    Trade ofertaTroca;
                    Item quer,oferta;//Itens que o usuário quer e o que ele vai dar em troca
                    int codQuer,codOferta;//Codigo do item que o usuário quer e o que ele vai dar em troca
                    User remetente,destinatario;//User remetente IOW:O usuário atual esperançosamente
                    // e Destinatario é o user da pessoa que tem o item desejado
                    System.out.print("Insira o código do item que deseja adquirir:");
                    codQuer=sc.nextInt();
                    
                    System.out.print("Insira o código do item que deseja oferecer em troca:");
                    codOferta=sc.nextInt();
                    
                    remetente=usuarios.getowner(codOferta);
                    if(remetente==usuarioAtual){
                        destinatario=usuarios.getowner(codQuer);
                        quer=destinatario.getItem(codQuer);
                        oferta=remetente.getItem(codOferta);
                        ofertaTroca=new Trade(oferta, quer, remetente, destinatario);}
                    else{
                        //Caso o item que o usuário tente fazer a troca usando o código de um item que não é dele.
                    }
                break;
                default:
                   
                    break;
            }
        }
    }

}
