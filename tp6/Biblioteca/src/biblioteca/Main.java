package biblioteca;

public class Main {
    public static void main(String[] args) {
        
        // 1. creo biblioteca
        Biblioteca nuevaBiblioteca = new Biblioteca("Biblio UTN");
        
        // 2. creo 3 autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "Jorge Luis Borges", "Argentino");

        // 3. agrego 5 libros a la biblioteca
        nuevaBiblioteca.agregarLibro("978-0743273565", "Cien Años de Soledad", 1967, a1);
        nuevaBiblioteca.agregarLibro("978-9504905188", "Ficciones", 1944, a3);
        nuevaBiblioteca.agregarLibro("978-0439708180", "Harry Potter y la Piedra Filosofal", 1997, a2);
        nuevaBiblioteca.agregarLibro("978-9504905189", "El Aleph", 1949, a3);
        nuevaBiblioteca.agregarLibro("978-0439708181", "Harry Potter y la Cámara Secreta", 1998, a2);
        
        // 4. listas todos los libros
        System.out.println("\n4. LISTADO COMPLETO:");
        nuevaBiblioteca.listarLibros();
        
        // 5. buscar por ISBN
        System.out.println("\n5. BUSQUEDA POR ISBN (ISBN 978-0439708180):");
        nuevaBiblioteca.buscarLibroPorIsbn("978-0439708180");
        
        // 6. filtrado por año
        System.out.println("\n6. FILTRAR POR AÑO (1998):");
        nuevaBiblioteca.filtrarLibrosPorAnio(1998);
        
        // 7. eliminar libro
        System.out.println("\n7. ELIMINAR LIBRO (ISBN 978-0439708181):");
        nuevaBiblioteca.eliminarLibro("978-0439708181");
        System.out.println("- Verificamos si se borro:");
        nuevaBiblioteca.listarLibros();
        
        // 8. cantidad total en la biblioteca
        System.out.println("\n8. CANTIDAD TOTAL DE LIBROS:");
        nuevaBiblioteca.obtenerCantidadLibros();
        
        // 9. lista de todos los autores
        System.out.println("\n9. AUTORES DE LOS LIBROS DISPONIBLES:");
        nuevaBiblioteca.mostrarAutoresDisponibles();
    }
}
