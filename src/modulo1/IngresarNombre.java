
package modulo1;

import java.util.Scanner;

public class IngresarNombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
                
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Hola " + nombre);
        System.out.println("Tu edad es " + edad);
    }
}
