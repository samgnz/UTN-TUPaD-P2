
package modulo1;

import java.util.Scanner;

public class ErrorEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        //String nombre = scanner.nextInt(); ERROR
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    }
}