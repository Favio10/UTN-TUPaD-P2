package universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {return id;}
    public String getNombre() {return nombre;}
    public String getEspecialidad() {return especialidad;}
    public List<Curso> getCursos() {return cursos;}
    
    public void agregarCurso(Curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
            
            c.setProfesor(this, false);
        }
    }
    
    public void eliminarCurso(Curso c) {
        if(this.cursos.remove(c)) {
            c.setProfesor(null, false);
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(" ¡No dicta cursos actualmente! ");
        } else {
            for (Curso c : cursos) {
                System.out.println(" - " + c.getCodigo() + ": " + c.getNombre());
            }
        }
    }
    
    public void mostrarInfo() {
        System.out.println("- Profesor: " + nombre + " (" + id + ")");
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos que dicta (" + cursos.size() + "):");
        listarCursos();
    }
    
}
