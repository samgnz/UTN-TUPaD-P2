package modulo3.Ejercicio1;

/**
 *
 * @author erika
 */
/**
 * Clase principal que ejecuta la aplicación.
 * Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
 */
public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.setNombre("Ana");
        estudiante1.setApellido("Perez");
        estudiante1.setCurso("Prog-2");
        estudiante1.setCalificacion(8);
        
        
        System.out.println("INFORMACION INICIAL:");
        estudiante1.mostrarInfo();
        
        System.out.println("\nSubir calificacion:");
        estudiante1.subirCalificacion(0.5);
        
        // Mostrar información después del aumento
        System.out.println("\nInformacion actualizada:");
        estudiante1.mostrarInfo();
        
        // Bajar calificación
        System.out.println("\nBajar calificacion:");
        estudiante1.bajarCalificacion(2);
        
        // Mostrar información después de la disminución
        System.out.println("\nInformacion actualizada:");
        estudiante1.mostrarInfo();
    }
    
}
