package modulo2;

import java.util.Scanner;

public class Ejercicio7_validacion_nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(scanner.nextLine());
            
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            
        } while (nota < 0 || nota > 10);
       
        System.out.println("Nota guardada correctamente.");
        
    }
    
}
