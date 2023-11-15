
package programación;
import java.util.Scanner;

public class Promedio {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
   
        System.out.println("Programa para saber el promedio de 3 números");
        double num1, num2, num3, resultado;
        System.out.println("Digite el primer número");
        num1=sc.nextDouble();
        System.out.println("Digite el segundo número");
        num2=sc.nextDouble();
        System.out.println("Digite el tercer número");
        num3=sc.nextDouble();
        
        resultado=(num1+num2+num3)/3;
        System.out.println("El promedio de los tres números es "+resultado);
    }
}
