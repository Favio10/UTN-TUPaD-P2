/*
 */
package pkg12.modificacion.de.un.array.de.precios.y.visualización.de.resultados;

/**
 * @author favio
 */
public class ModificacionDeUnArrayDePreciosYVisualizaciónDeResultados {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
