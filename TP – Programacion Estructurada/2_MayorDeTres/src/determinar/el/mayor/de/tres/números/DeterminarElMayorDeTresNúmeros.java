/*
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.

*/
package determinar.el.mayor.de.tres.números;
import java.util.Scanner;

/**
 *
 * @author favio
 */
public class DeterminarElMayorDeTresNúmeros {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Ingresa el primer numero entero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingresa el segundo numero entero: ");
        num2 = input.nextInt();
        
        System.out.print("Ingresa el tercer numero entero: ");
        num3 = input.nextInt();
        
        int mayor;
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
       }
        
        System.out.println("El mayor de los numeros ingresados es: " + mayor);
    }
}
