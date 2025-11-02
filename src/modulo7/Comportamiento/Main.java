package modulo7.Comportamiento;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        Perro p1 = new Perro("Tobi");
        Gato g1 = new Gato("Michi");
        Vaca v1 = new Vaca("Flora");
        
        animales.add(p1);
        animales.add(g1);
        animales.add(v1);
        
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
    
}
