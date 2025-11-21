package empleado;
public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(int horasTrabajadas, double valorHora, String nombre) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}
