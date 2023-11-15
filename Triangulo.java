
package programación;
import java.util.Scanner;

public class Triangulo {   
    
    public static void main(String[] args) {
        
        System.out.println("Para calcular el área del triángulo digite la base");
        Scanner sc=new Scanner(System.in);
        double base, altura, area;
        
        base=sc.nextDouble();
        
        System.out.println("Digite la altura");
        altura=sc.nextDouble();
       
        area= (base*altura)/2;
        
        System.out.println("El área del triángulo es "+area );
        
      
        
        
       
        
        
    
        
        
        
    }
    
    
    
    
    
    
    
    
}
