package modulo3.Ejercicio2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author erika
 */
public class MainMascota {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        
        mascota1.setNombre("Procer");
        mascota1.setEspecie("Border Collie");
        mascota1.setEdad(5);
        
        
        System.out.println("Informacion Inicial:");
        mascota1.mostrarInfo();
        
        System.out.println("\n --- Simulacion paso del tiempo ---");
        mascota1.cumplirAnios();
        mascota1.cumplirAnios();
        
        System.out.println("\nInformacion actualizada");
        mascota1.mostrarInfo();

    }
    
}
