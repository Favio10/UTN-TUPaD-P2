/*
Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
verificar los cambios
*/
package ppo;

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Informacion de la mascota");
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Edad: "+edad+" años");
    }
    
    public void cumplirAnios() {
        edad = edad + 1;
        System.out.println(nombre + " cumplió años. Ahora tiene " + edad + " años.");
    }
    
}
