package modulo2;

import java.util.Scanner;

public class Ejercicio5_suma_pares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int suma_pares = 0;

        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                suma_pares += numero;
            }

        }
        System.out.println("La suma de los números pares es: " + suma_pares);

    }

}
