package universidad;
import java.util.List;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
        System.out.println("Profesor " + p.getNombre() + " agregado");
    }
    
    public void agregarCurso(Curso c) {
        this.cursos.add(c);
        System.out.println("Curso " + c.getNombre() + " agregado");
    }
    
    public void listarProfesores() {
        System.out.println("LISTADO DE PROFESORES DE " + nombre);
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        System.out.println("LISTADO DE CURSOS DE " + nombre);
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
           for (Profesor p : profesores) {
               if (p.getId().equals(id)) {
                   return p;
               }
        }
           return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if(c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if(curso == null) {
            System.out.println("ERROR, curso con codigo "+codigoCurso+" no encontrado");
            return;
        }
        if(profesor == null) {
            System.out.println("ERROR, profesor con ID "+idProfesor+" no encontrado");
            return;
        }
        
        curso.setProfesor(profesor);
        System.out.println("\n ASIGNACION EXITOSA. Profesor "+profesor.getNombre() + " asignado a "+curso.getNombre());
    }
    
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        
        if(curso == null) {
            System.out.println("ERROR. curso con codigo " + codigo+" no encontrado");
            return;
        }
        curso.setProfesor(null);
        
        this.cursos.remove(curso);
        System.out.println("\n ELIMINACION CON EXITO. curso "+curso.getNombre()+" eliminado");
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        
        if(profesor == null) {
            System.out.println("ERROR. profesor con ID"+id+" no encontrado");
            return;
        }
        
        for(Curso c : new ArrayList<>(profesor.getCursos())) {
            c.setProfesor(null);
        }
        
        this.profesores.remove(profesor);
        System.out.println("ELIMINACION CON EXITO. profesor "+profesor.getNombre()+" eliminado y cursos desasignados");
    }
}
