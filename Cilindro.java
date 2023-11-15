
package programación;
import java.util.Scanner;


public class Cilindro {
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Para saber el área y volumen del cilindro digite su radio");
        double r, h, area, volumen;
        r=sc.nextDouble();
        System.out.println("Digite la altura");
        h=sc.nextDouble();
        area= (2*3.1416)*r*(r+h);
        volumen=3.1416*(r*r)*h;
        System.out.println("El área del cilindro es "+area);
        System.out.println("El volumen del cilindro es "+volumen);
       
        
                
        
        
        
    }
}
