package animal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("ZOO VIRTUAL");
        
        ArrayList<Animal> misAnimales = new ArrayList<>();
        
        misAnimales.add(new Perro("Firulais", 5));
        misAnimales.add(new Gato("Michi", 3));
        misAnimales.add(new Vaca("Lola", 8));
        misAnimales.add(new Perro("Rex", 2));
        
        for (Animal a : misAnimales) {
            a.descrbirAnimal();
            
            System.out.println("Sonido: ");
            a.hacerSonido();
        }
    }
}
