package modulo3.Ejercicio3;

/**
 *
 * @author erika
 */
public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        
        libro1.setTitulo("La puerta");
        libro1.setAutor("Juan Perez");
        libro1.setAñoPublicacion(1999);        
        libro1.mostrarInfo();
        
        System.out.println("\nModificacion de año valida:");
        libro1.setAñoPublicacion(2001);
        libro1.mostrarInfo();
        
        System.out.println("\nModificacion de año invalida:");
        libro1.setAñoPublicacion(2080);
        libro1.mostrarInfo();

    }
    
}
