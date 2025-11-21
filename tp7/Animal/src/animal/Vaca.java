package animal;

public class Vaca extends Animal {
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("¡MUUU MUUU!");
    }
}
