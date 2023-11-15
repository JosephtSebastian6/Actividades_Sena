
package programación;
import java.util.Scanner;

public class Euroadolar {
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite la cantidad de euros que tiene y desea pasar a dólares");
        double euro, dolar;
        euro=sc.nextDouble();
        
        dolar= euro*1.0729711;
        
        System.out.println("La cantidad de dólares que usted tiene son "+dolar);
       
        
    }
}
