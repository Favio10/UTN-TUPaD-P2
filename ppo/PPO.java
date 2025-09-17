/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ppo;

/**
 *
 * @author favio
 */
public class PPO {

    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante a1 = new Estudiante("Favio", "Olivera", "Programacion", 8.5);
        //mostrar info
        a1.mostrarInfo();
        //subir calif
        a1.subirCalificacion(1.3);
        //bajar calif
        a1.bajarCalificacion(0.5);
        System.out.println("-------------------------------------------");
        //Crear mascota
        Mascota a2 = new Mascota("Rocky", "Perro", 10);
        
        a2.mostrarInfo();
        
        a2.cumplirAnios();
        System.out.println("-------------------------------------------");
        //crear libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967);
        libro1.mostrarInfo();
        //año inválido
        libro1.setAnioPublicacion(3000);
        //año válido
        libro1.setAnioPublicacion(1985);
        //info final
        libro1.mostrarInfo();
        System.out.println("-------------------------------------------");
        //crear gallinas
        Gallina g1 = new Gallina(1, 2, 0);
        Gallina g2 = new Gallina(2, 1, 0);
        
        //gallina 1
        g1.ponerHuevo();
        g1.envejecer();
        g1.ponerHuevo();
        
        // gallina 2
        g2.envejecer();
        g2.ponerHuevo();
        
        System.out.println("\n--- Estado final de las gallinas ---");
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        System.out.println("-------------------------------------------");
        
        //creo nave con 50 dde combustible y maximo de 100
        
        naveEspacial nave = new naveEspacial("Tesla01", 50, 100);
        // despega sin costo
        nave.despegar();
        // intengo avanzar 60 pero tengo 50 por lo que no podria
        nave.avanzar(60);
        //recargo capacidad maxima
        nave.recargarCombustible(60);
        //intengo avanzar nuevamente
        nave.avanzar(60);
        
        nave.mostrarEstado();
        
        
        
    }
    
}
