/*
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
 */
package clasificación.de.edad;
import java.util.Scanner;

/**
 * @author favio
 */
public class ClasificaciónDeEdad {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingresa tu edad para obtener tu etapa de vida: ");
        edad = input.nextInt();
        
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17 ){
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59 ){
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }
    
}
