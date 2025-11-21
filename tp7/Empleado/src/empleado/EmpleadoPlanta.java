package empleado;
public class EmpleadoPlanta extends Empleado {
    private double sueldoBasico;
    private int antiguedad;

    public EmpleadoPlanta(double sueldoBasico, int antiguedad, String nombre) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBasico + (antiguedad * 1000);
    }
}
