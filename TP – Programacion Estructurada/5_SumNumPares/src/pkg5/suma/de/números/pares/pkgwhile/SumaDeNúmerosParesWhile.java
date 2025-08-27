/*
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
 */
package pkg5.suma.de.números.pares.pkgwhile;
import java.util.Scanner;
/**
 * @author favio
 */
public class SumaDeNúmerosParesWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int suma = 0;
        
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = input.nextInt();
        
        while(numero != 0) {
            if(numero % 2 == 0) {
                suma = suma + numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
        }
        
        System.out.print("La suma total de los numeros pares es: " + suma);
        System.out.println("");
    }
}
