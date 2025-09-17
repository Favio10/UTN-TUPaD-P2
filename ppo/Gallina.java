/*
Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad,
huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
mostrar su estado.
*/
package ppo;

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    
    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina "+idGallina+" puso un huevo. Total: "+huevosPuestos);
    }
    public void envejecer() {
        edad++;
        System.out.println("Gallina "+idGallina+" cumplio anios. Ahora tiene "+edad+ " años.");
    }
    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + ", Edad: " + edad + ", Huevos puestos: " + huevosPuestos);
    }
}
