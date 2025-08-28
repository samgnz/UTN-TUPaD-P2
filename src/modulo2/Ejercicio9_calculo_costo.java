package modulo2;

import java.util.Scanner;

public class Ejercicio9_calculo_costo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);       
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
        
    }
    
    static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10;
        }
        
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
}
