package biblioteca;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public void mostrarInfo() {
        System.out.println("Informacion de autor");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nacionalidad: " + this.nacionalidad);
    }
}
