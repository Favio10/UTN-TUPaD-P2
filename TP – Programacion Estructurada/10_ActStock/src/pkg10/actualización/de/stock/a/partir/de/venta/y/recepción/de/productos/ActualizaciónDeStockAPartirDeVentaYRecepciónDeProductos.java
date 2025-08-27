/*
 */
package pkg10.actualización.de.stock.a.partir.de.venta.y.recepción.de.productos;
import java.util.Scanner;

/**
 * @author favio
 */
public class ActualizaciónDeStockAPartirDeVentaYRecepciónDeProductos {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();
        
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.print("El nuevo stock del producto es: " + nuevoStock);
        System.out.println("");
    }
    
}
