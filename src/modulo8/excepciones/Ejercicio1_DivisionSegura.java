package modulo8.excepciones;

import java.util.Scanner;

/*
1.  División segura 
    ○ Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero.
 */
public class Ejercicio1_DivisionSegura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese numerador: ");
            int a = sc.nextInt();
            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }

}
