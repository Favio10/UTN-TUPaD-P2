/*
Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia),
recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
*/
package ppo;

public class naveEspacial {
    private String nombre;
    private int combustible;
    private int capacidadMaxima;
    private int distanciaRecorrida;
    
    
    public naveEspacial(String nombre, int combustible, int capacidadMaxima) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.capacidadMaxima = capacidadMaxima;
        this.distanciaRecorrida = 0;
    }
    
    public void despegar() {
        System.out.println("La nave "+nombre+" despego. Combustible disponible: "+combustible);
    }
    
    // 1 unidad de distancia = 1 unidad de combustible
    public void avanzar(int distancia) {
        if (combustible >= distancia ) {
            combustible = combustible - distancia;
            distanciaRecorrida = distanciaRecorrida + distancia;
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia +" km.");
        }
    }
    
    // definimos capacidad maxima 100
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= capacidadMaxima) {
            combustible = combustible + cantidad;
            System.out.println("Recarga realizada. Combustible actual: "+combustible);
        } else {
            combustible = capacidadMaxima;
            System.out.println("Se intentó sobrecargar. Combustible lleno al máximo (" + capacidadMaxima + ").");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("---Estado de la nave---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Combustible: "+combustible+"/"+capacidadMaxima);
        System.out.println("Distancia recorrida: "+distanciaRecorrida+" km");
    }
    
}













































