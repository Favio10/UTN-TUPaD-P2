
package tp4;

public class Tp4 {

    public static void main(String[] args) {
        Empleado emple1 = new Empleado(1, "Carlos", "Seguridad", 1300);
        Empleado emple2 = new Empleado("Erika", "Cajera");
        Empleado emple3 = new Empleado(3, "Martin", "Limpieza", 1200);
        Empleado emple4 = new Empleado("Romina", "Supervisor");
    
        emple1.actualizarSalario(5.5);
        emple2.actualizarSalario(7.0);
        emple3.actualizarSalario(200);
        emple4.actualizarSalario(300);
        
        
        System.out.println(emple1);
        System.out.println(emple2);
        System.out.println(emple3);
        System.out.println(emple4);
        
        System.out.println("Total de empleados: "+ Empleado.mostrarTotalEmpleados());
    }
}
