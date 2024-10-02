
public class teste {
    public void main (String args[]){   
    LocalDateTime now = LocalDateTime.now();
    int ano = now.getYear();
    int mes = now.getMonthValue();
    int dia = now.getDayOfMonth();
    int hora = now.getHour();
    int minuto = now.getMinute();
    int segundo = now.getSecond();

    System.out.printf("%d-%02d-%02d %02d:%02d:%02d", dia, mes,ano , hora, minuto, segundo);
    }
}
