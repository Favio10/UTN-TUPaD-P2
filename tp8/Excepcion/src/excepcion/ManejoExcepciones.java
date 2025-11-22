package excepcion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepciones {

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
        }
        System.out.println(" Edad validada: " + edad);
    }

    public static void leerArchivoSeguro(String rutaArchivo) throws IOException {
        System.out.println("\n--- 5. Leyendo archivo con try-with-resources ---");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("> " + linea);
            }
        } 
        System.out.println("Archivo cerrado automáticamente.");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(" 1. División Segura");
        try {
            int a = 10;
            int b = 0; 
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error capturado: " + e.getMessage());
            System.out.println("El divisor no puede ser cero.");
        }


        System.out.println("\n 2. Conversión de Cadena");
        try {
            String texto = "hola mundo"; 
            int numero = Integer.parseInt(texto);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("error capturado: La cadena no es un formato numérico válido.");
        }


        System.out.println("\n 4. Excepción Personalizada");
        try {
            validarEdad(-10); 
        } catch (EdadInvalidaException e) {
            System.out.println("️ Validación fallida: " + e.getMessage());
        }


        try {
            leerArchivoSeguro("archivo_inexistente.txt"); 
        } catch (java.io.FileNotFoundException e) {
             System.out.println(" Error capturado: El archivo especificado no fue encontrado."); 
        } catch (IOException e) {
             System.out.println("Error de lectura/escritura (catch genérico de IO): " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}