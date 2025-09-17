/*
  Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones.

 */
package ppo;


public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Curso: "+curso);
        System.out.println("Calificación: "+calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion = calificacion + puntos;
        System.out.println("La calificacion actual es "+calificacion);
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion = calificacion - puntos;
        System.out.println("La calificacion actual es "+calificacion);
    }
}
