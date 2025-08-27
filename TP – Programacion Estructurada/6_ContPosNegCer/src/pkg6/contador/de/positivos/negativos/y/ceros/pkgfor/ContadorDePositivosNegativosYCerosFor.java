/*
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.

 */
package pkg6.contador.de.positivos.negativos.y.ceros.pkgfor;
import java.util.Scanner;

/**
 * @author favio
 */
public class ContadorDePositivosNegativosYCerosFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;
        int numero;
        for (int i = 1; i < 11; i++) {
            System.out.print("Ingresa el numero " + i + ": ");
            numero = input.nextInt();
            if (numero == 0) {
                ceros = ceros + 1;
            } else if(numero > 0) {
                positivos = positivos + 1;
            } else {
                negativos = negativos + 1;
            }
            }
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        }
    }
    

