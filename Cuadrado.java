
package programación;
import java.util.Scanner;

public class Cuadrado {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite el valor de un lado del cuadrado para conocer área y perímetro");
        double x, area, perimetro;
        x=sc.nextDouble();
        
        area=x*x;
        perimetro=x+x+x+x;
        
        System.out.println("El área del cuadrado es "+area);
        System.out.println("El perímetro del cuadrado es "+perimetro);        
    }
    
    
    
}
