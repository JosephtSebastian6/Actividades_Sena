
package programación;
import java.util.Scanner;


public class Potencia {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite el número del que desea saber su potencia");
        double a, potencia;
        a=sc.nextDouble();
        
        potencia= a*a;
        System.out.println("La potencia del número digitado es  "+potencia);
        
    }
}
