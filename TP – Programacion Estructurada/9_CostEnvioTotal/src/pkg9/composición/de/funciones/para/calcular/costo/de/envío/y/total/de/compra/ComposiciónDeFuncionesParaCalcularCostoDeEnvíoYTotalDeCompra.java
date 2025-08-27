
package pkg9.composición.de.funciones.para.calcular.costo.de.envío.y.total.de.compra;
import java.util.Scanner;

/**
 * @author favio
 */
public class ComposiciónDeFuncionesParaCalcularCostoDeEnvíoYTotalDeCompra {

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.next();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
}
    

