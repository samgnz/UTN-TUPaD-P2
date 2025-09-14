package modulo3.Ejercicio5;

/**
 *
 * @author erika
 */
public class MainNaveEspacial {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial();
        
        nave1.setNombre("Nave Nodriza");
        nave1.setCombustible(50);
        
        System.out.println("Estado inicial de la nave");
        nave1.mostrarEstado();
        
        System.out.println("Intentando avanzar 60 unidades sin recargar");
        nave1.avanzar(60);
        System.out.println("---------------");
        
        System.out.println("Recargar 40 unidades de combustible");
        nave1.recargarCombustible(40);
        System.out.println("---------------");
        
        System.out.println("Intentando avanzar 60 unidades nuevamente");
        nave1.avanzar(60);
        System.out.println("---------------");
        System.out.println("Estado final de la nave");
        nave1.mostrarEstado();

        
    }
    
}
