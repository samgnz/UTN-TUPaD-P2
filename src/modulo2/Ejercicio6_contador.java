package modulo2;

import java.util.Scanner;


public class Ejercicio6_contador {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = Integer.parseInt(scanner.nextLine());
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
       
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
