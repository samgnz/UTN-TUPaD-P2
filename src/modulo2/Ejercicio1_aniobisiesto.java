package modulo2;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class Ejercicio1_aniobisiesto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingresa un año: ");
        anio = Integer.parseInt(input.nextLine());
        
        if (anio % 4 == 0 && anio % 100 != 0 ){
        System.out.println("el año " + anio + " es bisiesto");
        }
        else if (anio % 400 == 0){
            System.out.println("el año " + anio + " es bisiesto");
        } else {
            System.out.println("el año " + anio + " no es bisiesto");
    }
    }
    
}
