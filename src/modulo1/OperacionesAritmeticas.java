
package modulo1;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion;
        double division;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
        System.out.println("La suma entre los numeros es: " + suma);
        System.out.println("La resta entre los numeros es: " + resta);
        System.out.println("La multiplicacion entre los numeros es: " + multiplicacion);
        System.out.println("La division entre los numeros es: " + division);
        
    }
    
}
