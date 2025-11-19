package universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {return codigo;}
    public String getNombre() {return nombre;}
    public Profesor getProfesor() {return profesor;}
    
    public void setProfesor(Profesor nuevoProfesor, boolean mantenerInvariante) {
        if(this.profesor != null) {
            if (mantenerInvariante) {
                this.profesor.getCursos().remove(this);
            }
        }
        
        this.profesor = nuevoProfesor;
        
        if (nuevoProfesor != null && mantenerInvariante) {
            if (!nuevoProfesor.getCursos().contains(this)) {
                nuevoProfesor.getCursos().add(this);
            }
        }
    }
    
    public void setProfesor(Profesor nuevoProfesor) {
        setProfesor(nuevoProfesor, true);
    }
    
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "SIN ASIGNAR";
        System.out.println(" - Curso: " + nombre + " (" + codigo + ") ");
        System.out.println("Profesor responsable: " + nombreProfesor);
        
    }
}
