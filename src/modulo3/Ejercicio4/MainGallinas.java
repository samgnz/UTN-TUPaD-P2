package modulo3.Ejercicio4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author erika
 */
public class MainGallinas {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.setIdGallina(101);
        gallina1.setEdad(1.3);
        gallina1.setHuevos(15);
        
       
        gallina2.setIdGallina(102);
        gallina2.setEdad(0.7);
        gallina2.setHuevos(5);
        
        gallina1.mostrarEstado();
        System.out.println("------------");
        gallina2.mostrarEstado();
        
        System.out.println("------------");
        System.out.println("-- Simulacion del paso del tiempo --");
        System.out.println("------------");
        gallina1.envejecer();
        gallina1.envejecer();
        
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        
        gallina2.envejecer();
        gallina2.envejecer();
        
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        
        gallina1.mostrarEstado();
        System.out.println("------------");
        gallina2.mostrarEstado();
    }
    
}
