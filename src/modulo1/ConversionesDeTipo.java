
package modulo1;

import java.util.Scanner;

public class ConversionesDeTipo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        double division;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        division = (double) num1 / num2; 
        
        System.out.println("El resultado de la division es: " + division);
    }
}
