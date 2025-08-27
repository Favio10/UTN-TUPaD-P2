/*
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un 
método calcularDescuentoEspecial(double precio) que use la variable global para 
calcular el descuento especial del 10%. 
Dentro del método, declara una variable local descuentoAplicado, almacena 
el valor del descuento y muestra el precio final con descuento.
 */
package pkg11.calculo.de.descuento.especial.usando.variable.global;
import java.util.Scanner;
/**
 * @author favio
 */
public class CalculoDeDescuentoEspecialUsandoVariableGlobal {

    static double ejemploDeEntradaSalida = 0.10;
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado;
        double precioFinal;
        descuentoAplicado = precio * ejemploDeEntradaSalida;
        precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }
    
}
