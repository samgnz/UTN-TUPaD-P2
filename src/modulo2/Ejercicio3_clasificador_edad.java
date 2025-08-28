package modulo2;

import java.util.Scanner;

public class Ejercicio3_clasificador_edad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            System.out.println("Sos un niño");
        }else if (edad >= 12 && edad <= 17) {
            System.out.println("Sos un adolescente");
        } else if (edad >= 18 && edad <= 59){
            System.out.println("Sos un adulto");
        } else{
            System.out.println("Sos un adulto mayor");
        }
        
    }
    
}
