/*
    Impresión recursiva de arrays antes y después de modificar un elemento. 
*/
package pkg13.impresión.recursiva.de.arrays.antes.y.después.de.modificar.un.elemento;

/**
 *
 * @author favio
 */
public class ImpresiónRecursivaDeArraysAntesYDespuésDeModificarUnElemento {
    
    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);
        imprimirPrecios(precios, indice + 1);
    }
    

    public static void main(String[] args) {
        double precios[] = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        imprimirPrecios(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        imprimirPrecios(precios, 0);
    }
}
