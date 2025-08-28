package modulo2;

import java.util.Scanner;

public class Ejercicio2_num_mayor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Ingresa un número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa un segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa un tercer número: ");
        num3 = Integer.parseInt(input.nextLine());
        
        int num_mayor;
        
        if (num1 >= num2 && num1 >= num3){
            num_mayor = num1;
        } else if (num2 >= num1 && num2 >= num3){
            num_mayor = num2;
        } else {
            num_mayor = num3;
        }
        
        System.out.println("El numero mayor es: " + num_mayor);
    }
    
}
