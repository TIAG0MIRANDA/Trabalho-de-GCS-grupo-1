import java.time.*;
import java.util.ArrayList;

public class Trade {

        private User Sender;
        private User Receiver;
        private Item itemOferecido;
        private Item itemDesejado;
        private LocalDateTime momentoTroca;//Classe que vai ser usada para armazenar o momento que 
                                           //a troca foi feita
        

        public  Trade(Item offer, Item wish, User Sender, User Receiver){
                //Offer= item que está sendo ofertado pelo criador da troca
                //wish= item que o criador da troca quis
                //Sender= O criador da troca
                //Receiver= O que recebeu a oferta
                this.itemOferecido=offer;
                this.itemDesejado=wish;
                this.momentoTroca=LocalDateTime.now();//Armazena o momento que a troca foi feita de acordo 
                                                      //com o relógio local
                this.Sender=Sender;
                this.Receiver=Receiver;
        }

        public void verProposta(){

                System.out.printf("| %-30s | %-30s | %-9.2f |  %-3d  |troca por| %-30s | %-30s | %-9.2f |  %-3d  |%2d:%2d|%2d/%s/%4s|\n",Sender.getNome(),itemOferecido.getname(),itemOferecido.getprice(),itemOferecido.getcod(),Receiver.getNome(),itemDesejado.getname(),itemDesejado.getprice(),itemDesejado.getcod(),momentoTroca.getHour(),momentoTroca.getMinute(),momentoTroca.getDayOfMonth(),momentoTroca.getMonth(),momentoTroca.getYear());
                
        }

        public void trocar(){
                ArrayList<Item> inventario1 = getSender().getInventario();
                ArrayList<Item> inventario2 = getReceiver().getInventario();
                


                if(Sender.getItem(itemOferecido.getcod()) != null && Receiver.getItem(itemDesejado.getcod()) != null){
                inventario1.add(itemDesejado);
                getSender().deleteItem(itemOferecido.getcod());

                inventario2.add(itemOferecido);
                getReceiver().deleteItem(itemDesejado.getcod());

                ArrayList<Trade> trocas = getSender().getTrocasFeitas();
                trocas.remove(this);
                trocas = getReceiver().getTrocasRecebidas();
                trocas.remove(this);
                }
                
        }

        public void declinar(){
                ArrayList<Trade> trocas = getSender().getTrocasFeitas();
                trocas.remove(this);
                trocas = getReceiver().getTrocasRecebidas();
                trocas.remove(this);
        }
        public User getSender() {
                return Sender;
        }
            
        public User getReceiver() {
       
                return Receiver;
        }

        public Item getItemOferecido() {
        
                return itemOferecido;
        }

        public Item getItemDesejado() {
       
                return itemDesejado;
        }

        public LocalDateTime getMomentoTroca() {
        
                return momentoTroca;
        }
}
