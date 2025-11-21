package animal;
public class Animal {

        protected String nombre;
        protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void descrbirAnimal() {
        System.out.println("Soy "+nombre+" y tengo "+edad+" años.");
    }
    
    public void hacerSonido() {
            System.out.println("Haciendo sonido genérico...");
    }   
    
}
