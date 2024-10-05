import java.util.ArrayList;
import java.util.Arrays;

/**
 * Armazenamento de usuarios
 */
public class Userdata {
    private ArrayList<User> usuarios = new ArrayList<>();


    public Userdata() {
        usuarios.add(new User("Admin","admin@email.com","123456",(usuarios.size())));
        usuarios.add(new User("Pedro","pedro@email.com","654321",(usuarios.size())));
        usuarios.add(new User("Mario","mario@email.com","234567",(usuarios.size())));
        usuarios.add(new User("Ana","ana@email.com","098765",(usuarios.size())));
        usuarios.add(new User("Joao","Joao@email.com","528529",(usuarios.size())));
        usuarios.add(new User("Daniel","pedro@email.com","974168",(usuarios.size())));
        usuarios.add(new User("Leandra","pedro@email.com","876543",(usuarios.size())));
        usuarios.add(new User("Leandra","1","1",(usuarios.size())));
        
        usuarios.get(0).addItem("Lança-chamas", "Arma que dispara chamas de alta temperatura", 3500.00, 0, "Arma de Fogo");
        usuarios.get(0).addItem("Granada de Fragmentação", "Explosivo que se fragmenta e causa dano em área", 600.00, 1, "Explosivo");
        usuarios.get(0).addItem("Rifle de Assalto Avançado", "Arma de assalto com alta cadência de tiro e precisão", 4000.00, 2, "Arma de Fogo");
        usuarios.get(0).addItem("Escudo Energético", "Escudo de energia que oferece proteção adicional", 2500.00, 3, "Defesa");
        usuarios.get(0).addItem("Armadura de Combate Pesada", "Armadura que oferece proteção robusta em combate", 5500.00, 4, "Defesa");
        usuarios.get(0).addItem("Espada de Energia", "Arma corpo a corpo com lâmina energética", 7000.00, 5, "Arma Branca");
        usuarios.get(0).addItem("Bomba de Fumaça Avançada", "Cria uma nuvem densa de fumaça para ocultação", 500.00, 6, "Explosivo");
        usuarios.get(0).addItem("Granada de Choque Elétrico", "Explosivo que causa choque elétrico aos inimigos", 750.00, 7, "Explosivo");
        usuarios.get(0).addItem("Drone de Ataque", "Drone armado para ataques aéreos", 3000.00, 8, "Tecnologia Militar");
        usuarios.get(0).addItem("Rifle de Precisão com Mira", "Rifle de longo alcance com mira telescópica", 4500.00, 9, "Arma de Fogo");
        
        usuarios.get(1).addItem("Arco de Alta Precisão", "Arco com flechas de alta precisão para ataques furtivos", 1200.00, 10, "Arma Branca");
        usuarios.get(1).addItem("Faca Tática de Sobrevivência", "Faca projetada para combate e sobrevivência", 650.00, 11, "Arma Branca");
        usuarios.get(1).addItem("Armadura Leve", "Armadura leve que oferece mobilidade e proteção", 2000.00, 12, "Defesa");
        usuarios.get(1).addItem("Granada de Gás Tóxico", "Explosivo que libera gás tóxico em uma área", 450.00, 13, "Explosivo");
        usuarios.get(1).addItem("Lanterna Tática", "Lanterna de alta intensidade para operações noturnas", 300.00, 14, "Equipamento");
        usuarios.get(1).addItem("Kit de Medicina Avançado", "Kit de primeiros socorros com medicamentos avançados", 800.00, 15, "Equipamento");
        usuarios.get(1).addItem("Corda de Escalada Reforçada", "Corda para escalar paredes e obstáculos altos", 400.00, 16, "Equipamento");
        usuarios.get(1).addItem("Munição Explosiva", "Munição com efeito explosivo adicional", 600.00, 17, "Munição");
        usuarios.get(1).addItem("Óculos de Visão Noturna", "Óculos que permitem ver no escuro", 1500.00, 18, "Equipamento");
        usuarios.get(1).addItem("Rifle de Caça com Mira", "Rifle de caça de longo alcance com mira integrada", 2200.00, 19, "Arma de Fogo");
        
        usuarios.get(2).addItem("Pistola Compacta", "Arma de mão compacta para defesa pessoal", 700.00, 20, "Arma de Fogo");
        usuarios.get(2).addItem("Granada Incendiária Avançada", "Explosivo que causa incêndio e dano em área", 800.00, 21, "Explosivo");
        usuarios.get(2).addItem("Rifle de Precisão de Longo Alcance", "Arma de precisão para tiros de longa distância", 5000.00, 22, "Arma de Fogo");
        usuarios.get(2).addItem("Escudo Protetor", "Escudo que oferece proteção contra balas e ataques", 1500.00, 23, "Defesa");
        usuarios.get(2).addItem("Armadura de Defesa Pessoal", "Armadura que proporciona proteção pessoal aprimorada", 2500.00, 24, "Defesa");
        usuarios.get(2).addItem("Espada de Combate", "Espada projetada para combate corpo a corpo", 1000.00, 25, "Arma Branca");
        usuarios.get(2).addItem("Granada de Fragmentação Avançada", "Explosivo que causa dano massivo e se fragmenta", 700.00, 26, "Explosivo");
        usuarios.get(2).addItem("Drone de Reconhecimento", "Drone para reconhecimento e coleta de informações", 1800.00, 27, "Tecnologia Militar");
        usuarios.get(2).addItem("Arco de Combate", "Arco robusto para combate em distâncias médias", 1400.00, 28, "Arma Branca");
        usuarios.get(2).addItem("Lança de Energia", "Arma de longo alcance que dispara projéteis energéticos", 3000.00, 29, "Arma Branca");
        
        usuarios.get(3).addItem("Pistola Desert Eagle", "Arma curta com grande poder de impacto", 1000.00, 30, "Arma de Fogo");
        usuarios.get(3).addItem("Escudo Balístico", "Escudo à prova de balas usado para proteção", 1500.00, 31, "Defesa");
        usuarios.get(3).addItem("Granada de Proximidade", "Explode quando um inimigo se aproxima", 500.75, 32, "Explosivo");
        usuarios.get(3).addItem("Armadilha de Corda", "Armadilha silenciosa que imobiliza o inimigo", 300.50, 33, "Equipamento");
        usuarios.get(3).addItem("Sniper Semiautomático", "Rifle de precisão com disparo rápido", 2500.00, 34, "Arma de Fogo");
        usuarios.get(3).addItem("Revólver Magnum", "Arma de curto alcance com alto dano", 850.00, 35, "Arma de Fogo");
        usuarios.get(3).addItem("Spray de Cura", "Recupera parcialmente a saúde durante o combate", 150.25, 36, "Equipamento");
        usuarios.get(3).addItem("Granada Incendiária", "Causa dano em área com fogo", 250.00, 37, "Explosivo");
        usuarios.get(3).addItem("Radar Portátil", "Detecta inimigos em um raio curto", 700.50, 38, "Equipamento");
        usuarios.get(3).addItem("Drone Explosivo", "Drone de controle remoto com carga explosiva", 2000.00, 39, "Tecnologia Militar");
        
        usuarios.get(4).addItem("Arma de Plasma", "Arma de ficção científica que dispara plasma", 5000.00, 40, "Arma de Fogo");
        usuarios.get(4).addItem("Canhão de Mão", "Arma de grande calibre usada para grande impacto", 3500.00, 41, "Arma de Fogo");
        usuarios.get(4).addItem("Granada de Fragmentação", "Explosivo que se fragmenta ao explodir", 300.00, 42, "Explosivo");
        usuarios.get(4).addItem("Armadura Exoesqueleto", "Armadura avançada que aumenta a força e resistência", 4000.00, 43, "Defesa");
        usuarios.get(4).addItem("Pistola Automática", "Arma de mão com disparo automático", 1200.50, 44, "Arma de Fogo");
        usuarios.get(4).addItem("Kit de Camuflagem", "Equipamento que torna o usuário invisível por tempo limitado", 2500.75, 45, "Equipamento");
        usuarios.get(4).addItem("Detetor de Movimento", "Detecta inimigos em movimento nas proximidades", 800.00, 46, "Equipamento");
        usuarios.get(4).addItem("Bomba de Fumaça Tóxica", "Cria uma nuvem de fumaça que causa dano aos inimigos", 500.00, 47, "Explosivo");
        usuarios.get(4).addItem("Torretas Automáticas", "Armas automáticas que atacam inimigos próximos", 2500.00, 48, "Tecnologia Militar");
        usuarios.get(4).addItem("Rifle de Caça", "Arma precisa de longo alcance, usada para caça", 1800.00, 49, "Arma de Fogo");
        
        usuarios.get(5).addItem("Machado de Combate", "Arma branca poderosa para combate corpo a corpo", 1500.00, 50, "Arma Branca");
        usuarios.get(5).addItem("Canhão de Laser", "Arma pesada que dispara raios de energia concentrada", 6000.00, 51, "Arma de Fogo");
        usuarios.get(5).addItem("Granada de Estilhaço", "Explosivo que lança estilhaços cortantes ao explodir", 750.00, 52, "Explosivo");
        usuarios.get(5).addItem("Coquetel Molotov", "Explosivo incendiário de curto alcance", 250.00, 53, "Explosivo");
        usuarios.get(5).addItem("Lança-Granadas", "Arma de grande calibre que lança granadas explosivas", 4500.00, 54, "Arma de Fogo");
        usuarios.get(5).addItem("Faca Karambit", "Faca com lâmina curva, ideal para combate de curta distância", 500.00, 55, "Arma Branca");
        usuarios.get(5).addItem("Escudo de Defesa", "Escudo portátil para defesa pessoal", 1000.00, 56, "Defesa");
        usuarios.get(5).addItem("Drone de Vigilância", "Drone equipado com câmeras para monitoramento", 2000.00, 57, "Tecnologia Militar");
        usuarios.get(5).addItem("Granada Flashbang", "Explosivo que cega temporariamente inimigos", 300.00, 58, "Explosivo");
        usuarios.get(5).addItem("Lança-chamas Avançado", "Arma de combate que dispara chamas em longa distância", 5000.00, 59, "Arma de Fogo");

        usuarios.get(6).addItem("Pistola Silenciada", "Arma de fogo com silenciador para operações furtivas", 800.00, 60, "Arma de Fogo");
        usuarios.get(6).addItem("Granada de Luz", "Explosivo que emite uma luz intensa para desorientar inimigos", 300.00, 61, "Explosivo");
        usuarios.get(6).addItem("Armadura Leve de Combate", "Proteção leve com mobilidade aprimorada", 1500.00, 62, "Defesa");
        usuarios.get(6).addItem("Bomba de Adesão", "Explosivo que gruda em superfícies e explode após um tempo", 700.00, 63, "Explosivo");
        usuarios.get(6).addItem("Kit de Primeiros Socorros", "Conjunto para curar ferimentos leves", 200.00, 64, "Equipamento");
        usuarios.get(6).addItem("Arco Curto", "Arco compacto e leve, ideal para distâncias curtas", 900.00, 65, "Arma Branca");
        usuarios.get(6).addItem("Faca de Arremesso", "Faca equilibrada para ser lançada com precisão", 300.00, 66, "Arma Branca");
        usuarios.get(6).addItem("Máscara de Gás", "Equipamento de proteção contra gases tóxicos", 500.00, 67, "Equipamento");
        usuarios.get(6).addItem("Drone de Suprimentos", "Drone que entrega suprimentos médicos e munição", 2500.00, 68, "Tecnologia Militar");
        usuarios.get(6).addItem("Granada de Impacto", "Explosivo que detona ao impacto", 600.00, 69, "Explosivo");

        usuarios.get(7).addItem("Rifle de Assalto Compacto", "Arma de fogo de médio alcance com alta taxa de disparo", 3500.00, 70, "Arma de Fogo");
        usuarios.get(7).addItem("Escudo de Energia Portátil", "Dispositivo que gera um escudo temporário de energia", 3000.00, 71, "Defesa");
        usuarios.get(7).addItem("Mina Terrestre", "Explosivo que detona ao ser pisado", 1000.00, 72, "Explosivo");
        usuarios.get(7).addItem("Armadura de Titânio", "Proteção avançada com resistência a balas e explosões", 5000.00, 73, "Defesa");
        usuarios.get(7).addItem("Pistola de Dardos", "Arma que dispara dardos tranquilizantes", 1200.00, 74, "Arma de Fogo");
        usuarios.get(7).addItem("Faca de Combate", "Arma branca afiada, ideal para combate corpo a corpo", 400.00, 75, "Arma Branca");
        usuarios.get(7).addItem("Granada de Fumaça", "Dispositivo que libera fumaça densa para ocultação", 300.00, 76, "Explosivo");
        usuarios.get(7).addItem("Kit de Camuflagem Avançado", "Equipamento que melhora a furtividade em ambientes variados", 1500.00, 77, "Equipamento");
        usuarios.get(7).addItem("Rifle de Precisão Avançado", "Rifle de alta precisão com mira telescópica avançada", 5000.00, 78, "Arma de Fogo");
        usuarios.get(7).addItem("Granada de Fragmentação Leve", "Explosivo que causa dano em uma área pequena", 400.00, 79, "Explosivo");
    }

    /**
     * Valida o login
     * @param email e-mail de login
     * @param senha a senha
     * @return true caso o e-mail exista e a senha esteja correta, false caso contrario.
     */
    public boolean validaLogin(String email, String senha) {
        for (User user : usuarios) {
            if(email.equals(user.getEmail()) && senha.equals(user.getSenha())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Este metodo deve ser chamado apenas apos o validaLogin()
     * @param email e-mail de login (validado em validaLogin())
     * @param senha senha (validado em validaLogin())
     * @return O usuario a ser acessado ou null caso utilizado incorretamente
     */
    public User login(String email, String senha) {
        for (User user : usuarios) {
            if(email.equals(user.getEmail()) && senha.equals(user.getSenha())) {
                return user;
            }
        }
        return null; //se tudo der certo jamais chegaremos aqui
    }

    /**
     * Verifica se o e-mail ja esta em uso
     * @param email e-mail a ser verificado
     * @return true se o e-mail ja esta em uso
     */
    public boolean verificaEmail(String email) {
        for (User user : usuarios) {
            if(email.equals(user.getEmail())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se o nome de usuario ja esta em uso
     * @param nome Nome de usuario a ser verificado
     * @return True se o nome de usuario ja esta em uso
     */
    public boolean verificaNome(String nome){
        for (User user : usuarios) {
            if(nome.equals(user.getNome())) {
                return true;
            }
        }
        return false;
    }

    public void adicionar(User u){
        usuarios.add(u);
    }

    public  int getitemcod(){


        int cod = 0;

        for(int i = 0; i<usuarios.size();i++){

           cod += usuarios.get(i).getInventario().size();

        }

        return cod;

    }

    public  ArrayList<Integer> gabarito(){

        int[] cods = new int[getitemcod()];
        double[] vals = new double[getitemcod()];
        int control = 0;
        ArrayList<Integer> gabarito = new ArrayList<>();

        for(int i = 0;i <usuarios.size() ;i++){

            for(int j = 0;j <usuarios.get(i).getInventario().size() ;j++){
            
               
            cods[control] = usuarios.get(i).getInventario().get(j).getcod();
            vals[control] = usuarios.get(i).getInventario().get(j).getprice();

            control++;
                
            }

        }

        Arrays.sort(vals);

        

        for(int k = 0;k <control ;k++){

            for(int i = 0;i <usuarios.size() ;i++){

                for(int j = 0;j <usuarios.get(i).getInventario().size() ;j++){
                    
                    if(vals[k] == usuarios.get(i).getInventario().get(j).getprice()){
                   
                        for(int l = 0;l <control ;l++){

                            if(cods[l] == usuarios.get(i).getInventario().get(j).getcod()){

                                boolean teste = true;
                                for(int m = 0 ; m <gabarito.size(); m++){

                                    if( cods[l] == gabarito.get(m)){

                                        teste = false;
                                    }

                                }

                                if(teste){

                                    gabarito.add(cods[l]);

                                }

                            }

                        }

                    }

                }

            
            }

        }

        return gabarito;



    }

    public  boolean additemto(String name,String def,double val,int id,String ctg){

        for(int i = 0;i <usuarios.size();i++){

            if(id == usuarios.get(i).getId()){

                usuarios.get(i).addItem(name,def,val,getitemcod(),ctg);
                return true;

            }

        }

        return false;
        
    }

    public void mercadoprint(int atual){

        ArrayList<Integer> gab = gabarito(); 

        int paginas = gab.size()/10,itenslast = gab.size()%10,pagina = atual;

        if(itenslast != 0){

            paginas++;

        }

        

            Clear.clear();

            if(pagina == paginas-1){

                itenslast = gab.size();

            }
            else{

                itenslast = (10*pagina)+10;
            }

        
        System.out.println("|        Dono        |              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");
       
        for(int i = 10*pagina; i <itenslast;i++){

            for(int j = 0; j < usuarios.size();j++){
               
                for(int k = 0; k < usuarios.get(j).getInventario().size();k++){

                    if(usuarios.get(j).getInventario().get(k).getcod() == gab.get(i)){
                        
                        System.out.printf("| %-18s ",usuarios.get(j).getNome());
                        usuarios.get(j).getInventario().get(k).itemPrint();
         
                    }

                }
            

            }

        }
        
        if(pagina == paginas-1){

             System.out.println("digite 1 para pagina anterior 2 para voltar:");
        }

        else{

            System.out.println("digite 1 para pagina anterior 2 para pagina seguinte");

        }

    
    }

    public int getPaginas(){

        ArrayList<Integer> gab = gabarito();
        int paginas = gab.size()/10,itenslast = gab.size()%10;

        if(itenslast != 0){

            paginas++;

        }
        return paginas;

    }

     public void printabuscaitem(String item){

        System.out.println("|        Dono        |              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");

        for(int i = 0;i <usuarios.size();i++){

            for(int j = 0;j <usuarios.get(i).getInventario().size();j++){


                if(usuarios.get(i).getInventario().get(j).getname().toUpperCase().contains(item.toUpperCase())){
                    
                    System.out.printf("| %-18s ",usuarios.get(i).getNome());
                    usuarios.get(i).getInventario().get(j).itemPrint();

                }

            
            }



        }


    }
    public void printabuscaNome(String name){

        System.out.println("|        Dono        |              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");

        for(int i = 0;i <usuarios.size();i++){

            for(int j = 0;j <usuarios.get(i).getInventario().size();j++){


                if(usuarios.get(i).getNome().toUpperCase().contains(name.toUpperCase())){
                    
                    System.out.printf("| %-18s ",usuarios.get(i).getNome());
                    usuarios.get(i).getInventario().get(j).itemPrint();

                }

            
            }



        }


    }

    public void printabuscadef(String def){

        System.out.println("|        Dono        |              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");

        for(int i = 0;i <usuarios.size();i++){

            for(int j = 0;j <usuarios.get(i).getInventario().size();j++){


                if(usuarios.get(i).getInventario().get(j).getdef().toUpperCase().contains(def.toUpperCase())){
                    
                    System.out.printf("| %-18s ",usuarios.get(i).getNome());
                    usuarios.get(i).getInventario().get(j).itemPrint();

                }

            
            }



        }


    }

    public void printabuscactg(String ctg){

        System.out.println("|        Dono        |              Item              |                                Descriçao                               |   Valor   |         Ctg        |  Cod  |");

        for(int i = 0;i <usuarios.size();i++){

            for(int j = 0;j <usuarios.get(i).getInventario().size();j++){


                if(usuarios.get(i).getInventario().get(j).getctg().toUpperCase().contains(ctg.toUpperCase())){
                    
                    System.out.printf("| %-18s ",usuarios.get(i).getNome());
                    usuarios.get(i).getInventario().get(j).itemPrint();

                }

            
            }



        }


    }

    public String getctg(int i){

        
        switch (i) {
            
            case 1:
             return "Arma de Fogo";
             
            case 2:
            return "Defesa";
         
        case 3:
        return  "Explosivo";
           
        case 4:
            return "Arma Branca";
            
        case 5:
        return  "Defesa";
            
        case 6:
        return  "Tecnologia Militar";
            
        case 7:
            return "Equipamento";
          
        default:
        return  "Munição";
        

        }

}

    public int getUserId(){

    return usuarios.size();


    }

    public  int getowner(int itemid){

        for(int i = 0;i < usuarios.size();i++){

            for(int j = 0;j<usuarios.get(i).getInventario().size();j++){


                if(itemid == usuarios.get(i).getInventario().get(j).getcod()){

                    return usuarios.get(i).getId();

                }

            }
        }

        return -1;
    }




    
}
