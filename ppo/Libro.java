/*
Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.
*/
package ppo;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.setAnioPublicacion(anioPublicacion);
    }
    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2025) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año de publicacion invalida: " + anio);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
    }
}
