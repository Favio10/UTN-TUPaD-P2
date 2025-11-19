package universidad;
public class Main {
    public static void main(String[] args) {
        
        Universidad utn = new Universidad("UTN");
        
        // 1. crear 3 profesores y 5 cursos
        Profesor p1 = new Profesor("P101", "Dr. Ricardo Iorio", "Algoritmos");
        Profesor p2 = new Profesor("P202", "Dr Carlos Garcia", "Bases de datos");
        Profesor p3 = new Profesor("P303", "Dra Mercedes Sosa", "POO");
        
        Curso c1 = new Curso("C001", "Programación  I");
        Curso c2 = new Curso("C002", "Bases de Datos SQL");
        Curso c3 = new Curso("C003", "Análisis y Diseño");
        Curso c4 = new Curso("C004", "Redes");
        Curso c5 = new Curso("C005", "Programación II");
        
        // 2. agrego a la universidad 
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);
        
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        
        // 3. asigno profesores a cursos
        utn.asignarProfesorACurso("C001", "P303");
        utn.asignarProfesorACurso("C002", "P202");
        utn.asignarProfesorACurso("C005", "P303");
        
        // 4. listar profesores con cursos
        System.out.println("Listado inicial");
        utn.listarCursos();
        utn.listarProfesores();
        
        // 5. cambiar profesor y verificar
        System.out.println("CAMBIO de profesor : de 303 a 101");
        utn.asignarProfesorACurso("C001", "P101");
        
        utn.buscarProfesorPorId("P303").mostrarInfo();
        utn.buscarProfesorPorId("P101").mostrarInfo();
        
        // 6. eliminar curso y verificar
        System.out.println("Eliminar curso C005");
        utn.eliminarCurso("C005");
        
        utn.buscarProfesorPorId("P303").mostrarInfo();
        
        // 7. remover profesor
        System.out.println("Eliminar profesor (P101");
        utn.eliminarProfesor("P101");
        
        // 8. reporte
        utn.listarCursos();
    }
}
