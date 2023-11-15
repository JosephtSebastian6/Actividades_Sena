
package programación;
import java.util.Scanner;

public class Suma {
    
    public static void main(String[] args) {
        
        System.out.println("Digite los números que desea sumar");
        Scanner sc=new Scanner(System.in);
        
        Double a, b, suma;
        
        System.out.println("Digite el primer número");
        a=sc.nextDouble();
        System.out.println("Digite el segundo número");
        b=sc.nextDouble();
        suma= a+b;
        System.out.println("La suma de los dos números es: " +suma);
        
        
        
        
    }
}
