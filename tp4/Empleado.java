
package tp4;

public class Empleado {

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 2000;
    }
    
    
    public void actualizarSalario(double porcentaje) {
        double aumento = this.salario * (porcentaje / 100);
        this.salario += aumento;
        System.out.println("Se aplico un aumento del "+porcentaje+"% al empleado "+nombre);
    }
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
        System.out.println("Se aplico un aumento de $"+cantidadFija+" al empleado "+nombre);
    }


    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
        
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
       
}


