package vehiculo;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Auto");
        System.out.println("Puertas: " + cantidadPuertas);
    }
    
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        
        System.out.println("- Informacion del Auto:");
        miAuto.mostrarInfo();
    }
}
