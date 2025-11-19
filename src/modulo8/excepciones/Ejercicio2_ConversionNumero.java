package modulo8.excepciones;

import java.util.Scanner;

/*
2. Conversión de cadena a número 
    ○ Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido
*/

public class Ejercicio2_ConversionNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = scanner.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida.");
        }

    }

}
