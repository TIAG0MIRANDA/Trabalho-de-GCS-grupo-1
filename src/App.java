import java.util.Scanner;

public class App {
    private Scanner sc = new Scanner(System.in);
    private Userdata usuarios = new Userdata(); //usuarios serao guardados aqui
    private User usuarioAtual = null; //usuario logado no sistema

    public void executar(){
        boolean a = true;
        while(a){
            System.out.println("BEM-VINDO AO SISTEMA DE TROCA DO TELEJOGO 2000");
            System.out.println("[0] Sair");
            System.out.println("[1] Login");
            System.out.println("[2] Cadastro");
            switch (sc.nextLine()){
                case "0":
                    System.out.println("Obrigado por utilizar o sistema!");
                    a = false;
                    break;
                case "1":
                    login();
                    break;
                case "2":
                    cadastro();
                    break;
                default:
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
        String e = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String s = sc.nextLine();
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
            System.out.println("Nome de usuario: " + n);
            System.out.println("E-mail: " + e);
            System.out.println("Digite sua senha (Minimo 8 caracteres):");
            s = sc.nextLine();
            if (s.length() < 8){
                System.out.println("A senha possui menos de 8 caracteres, tente novamente." +
                                    "\nDigite qualquer tecla.");
                sc.nextLine();
            } else {
                vs = false;
            }
        }

        System.out.println("Usuario criado com sucesso!");
        System.out.println("Nome de usuario: " + n);
        System.out.println("E-mail: " + e);
        usuarios.adicionar(new User(n,e,s));
        System.out.println("Digite qualquer tecla para retornar a tela de login.");
        sc.nextLine();

    }

    /**
     * A partir deste metodo o usuario ira interagir com o resto do sistema quando logado
     */
    public void interfaceDoUsuario(){
        boolean a = true;
        while(a){
            System.out.println("Ola, " + usuarioAtual.getNome() + "!");
            System.out.println("O que deseja fazer?");
            System.out.println("[0] Sair");
            //TODO Inserir tudo que um usuario possa fazer enquanto logado

            switch (sc.nextLine()){
                case "0":
                    a = false;
                    usuarioAtual = null; //deslogar o usuario
                    System.out.println("Obrigado por utilizar o sistema!"
                            + "\nDigite qualquer tecla.");
                break;
                default:
                    System.out.println("Opcao invalida, digite qualquer tecla");
                    sc.nextLine();
                    break;
            }
        }
    }

}
