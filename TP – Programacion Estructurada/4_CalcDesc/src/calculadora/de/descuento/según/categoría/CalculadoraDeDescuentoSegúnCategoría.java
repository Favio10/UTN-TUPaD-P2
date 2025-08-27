/*
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
 */
package calculadora.de.descuento.según.categoría;

import java.util.Scanner;
/**
 *@author favio
 */
public class CalculadoraDeDescuentoSegúnCategoría {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double precio;
        String categoria;
        
        System.out.print("Ingresa el precio del producto que te interesa: $");
        precio = input.nextDouble();
        
        System.out.print("Ingresa la categoria del producto(A, B o C): ");
        categoria = input.next().toUpperCase();
    
        double  precioFinal;
        int descuentoAplicado;
        if (categoria.equals("A")) {
            descuentoAplicado = 10;
            precioFinal = precio - (precio * 0.10);
        } else if (categoria.equals("B")) {
            descuentoAplicado = 15;
            precioFinal = precio - (precio * 0.15);
         } else if (categoria.equals("C")) {
             descuentoAplicado = 20;
            precioFinal = precio - (precio * 0.20);
         } else {
            System.out.println("Categoría inválida!");
            return; 
        }

        System.out.println("Descuento Aplicado: " + descuentoAplicado + "%");
        System.out.print("Precio Final: " + precioFinal);
        System.out.println("");
}
}