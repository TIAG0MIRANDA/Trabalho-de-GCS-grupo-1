import java.util.Scanner;


public class BetterScanner {

    public static int scannerInt(Scanner in){

        boolean loop = true;

        while(loop){

        if(in.hasNextInt()){

            return in.nextInt();

        }
        else{
            in.next();
        }
        
        
    }

         return 0;

    }

    public static double scannerDouble(Scanner in){

        boolean loop = true;

        while(loop){

        if(in.hasNextDouble()){

            return in.nextDouble();

        }
        else{
            in.next();
        }
        
        
    }

         return 0;

    }



}