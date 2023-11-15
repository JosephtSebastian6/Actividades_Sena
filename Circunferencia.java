
package programación;
import java.util.Scanner;

public class Circunferencia {
    
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Para conocer el área y la longitud de la circunferencia");
        System.out.println("Digite el radio de la circunferencia "); 
        
        double r, longitud, area;
        r=sc.nextDouble();
        longitud=(2*3.1416)*r;
        area=3.1416*(r*r);
        
        System.out.println("La longitud de la circunferencia es "+longitud);
        System.out.println("El área de la circunferencia es "+area);
        
        
        
    }
    
    
}
