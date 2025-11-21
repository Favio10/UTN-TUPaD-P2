package figura;
public class Main {
    public static void main(String[] args) {
        System.out.println("- Inicio del programa de figuras -");
        
        Figura[] misFiguras = new Figura[2];
        
        misFiguras[0] = new Circulo("Circulo Rojo", 10.0);
        misFiguras[1] = new Rectangulo("Rectangulo Azul", 5.0, 20.0);
        
        for (Figura f : misFiguras) {
            System.out.println("Mostrando figuras..");
            
            double areaCalculada = f.calcularArea();
            
            System.out.println("- Area: " + areaCalculada);
        }
    }
}
