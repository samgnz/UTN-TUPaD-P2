package modulo2;

import java.util.Scanner;

public class Ejercicio8_calculo_precio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Integer.parseInt(scanner.nextLine());

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

    }

    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoPorc = impuesto / 100;
        double descuentoPorc = descuento / 100;

        double precioFinal = precioBase + (precioBase * impuestoPorc) - (precioBase * descuentoPorc);

        return precioFinal;
    }

}
