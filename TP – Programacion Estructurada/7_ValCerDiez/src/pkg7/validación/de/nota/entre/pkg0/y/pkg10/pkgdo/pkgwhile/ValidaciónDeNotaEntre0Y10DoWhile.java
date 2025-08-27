/*
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.

 */
package pkg7.validación.de.nota.entre.pkg0.y.pkg10.pkgdo.pkgwhile;
import java.util.Scanner;

/**
 *
 * @author favio
 */
public class ValidaciónDeNotaEntre0Y10DoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente. ");
    }  
}
  
