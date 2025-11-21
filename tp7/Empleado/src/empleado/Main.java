package empleado;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> misEmpleados = new ArrayList<>();
        
        misEmpleados.add(new EmpleadoPlanta(50000.0, 5, "Carlos (Fijo)")); 
        misEmpleados.add(new EmpleadoTemporal(40, 2500.0, "Ana (Temp)"));
        misEmpleados.add(new EmpleadoPlanta(60000.0, 10, "Roberto (Fijo)"));
        
        System.out.println("NOMINA DE EMPLEADOS");
        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.nombre);
            System.out.println("Sueldo a pagar: $" + e.calcularSueldo());
            
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" - Personal de Planta (Tiene beneficios)");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" - Personal Contratado (Por horas)");
            }
        }
    }
}
