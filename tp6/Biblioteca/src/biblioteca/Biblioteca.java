package biblioteca;
import java.util.ArrayList;

public class Biblioteca {
        private String nombre;
        private ArrayList<Libro> libros;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevolibro = new Libro(isbn, titulo, anioPublicacion, autor);
        
        libros.add(nuevolibro);
        
        System.out.println("Libro " + titulo + " agregado a la biblioteca.");
    }
    
    public void obtenerCantidadLibros() {
        System.out.println("Total de libros: " + libros.size());
    }
    
    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }
    
    public void buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                l.mostrarInfo();
                return;
            }
        }
        System.out.println("Libro no encontrado");
    }
    
    public void eliminarLibro(String isbn){
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                libros.remove(l);
                System.out.println("Libro con ISBN " + isbn + " eliminado.");
                return;
            }
        }
        System.out.println("Libro con ISBN " + isbn + " no encontrado.");
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros en el año "+ anio);
        }
    }
    
    public void mostrarAutoresDisponibles() {
        for (Libro l : libros) {
            Autor a = l.getAutor();
            System.out.println(a.getNombre());
        }
    }
    
}
