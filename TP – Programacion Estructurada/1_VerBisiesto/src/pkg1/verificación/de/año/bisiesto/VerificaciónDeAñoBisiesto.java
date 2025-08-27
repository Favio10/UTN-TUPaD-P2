/*
Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.

 */
package pkg1.verificación.de.año.bisiesto;

import java.util.Scanner;
/**
 * @author favio
 */
public class VerificaciónDeAñoBisiesto {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int año;
        
        System.out.print("Ingresa un año para validar si es bisiesto: ");
        año = input.nextInt();
        if (año % 4 == 0 && año % 100 != 0) {
            System.out.println("El año " + año + " es BISIESTO!");
        

        } else if (año % 4 == 0 && año % 400 == 0) {
                System.out.println("El año " + año + " es BISIESTO!");
        }
        
        else {
            System.out.println("El año " + año + " NO es BISIESTO!");
        }
    }
}
