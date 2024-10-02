import java.time.LocalDateTime;



public class troca{

    private item[] itensDesejados;
    private item[] itensOferecidos;
    private LocalDateTime data;


    public troca(item[] desejado, item[] oferecido){
        this.itensDesejados=desejado;
        this.itensOferecidos=oferecido;
        this.data=LocalDateTime.now();
    }

    public String getOferecidos(){
        for(int i=0;i<itensOferecidos.length;i++){
            System
        }
    }

    public String toString(){
        
        int ano = data.getYear();
        int mes = data.getMonthValue();
        int dia = data.getDayOfMonth();
        int hora = data.getHour();
        int minuto = data.getMinute();
        int segundo = data.getSecond();
    
        System.out.printf("%d-%02d-%02d %02d:%02d:%02d", dia, mes,ano , hora, minuto, segundo);
    }
}