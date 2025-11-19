package modulo8.excepciones;

import java.util.Scanner;
import modulo8.excepciones.custom.EdadInvalidaException;

/*
4.Excepción personalizada 
    ○ Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor  a 120. Capturarla y mostrar mensaje. 
 */
public class Ejercicio4_ValidarEdad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad fuera de rango permitido.");
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
