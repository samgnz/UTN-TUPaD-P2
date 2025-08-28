package modulo2;

import java.util.Scanner;

public class Ejercicio4_calculadora_descuento {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int precio;
        char categoria;

        System.out.print("Ingresa el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa la categoria del producto (A, B o C): ");
        categoria = input.nextLine().charAt(0);

        double porcentajeDescuento = 0;
        double montoDescuento = 0;
        double precioFinal = precio;

        if (categoria == 'A') {
            porcentajeDescuento = 10;
        } else if (categoria == 'B') {
            porcentajeDescuento = 15;
        } else if (categoria == 'C') {
            porcentajeDescuento = 20;
        } else {
            System.out.println("Categoría inválida. No se aplicará descuento.");
        }

        if (categoria == 'A' || categoria == 'B' || categoria == 'C') {
            montoDescuento = precio * (porcentajeDescuento / 100);
            precioFinal = precio - montoDescuento;

            System.out.println("Precio original: " + precio);
            System.out.println("Descuento aplicado: " + (int) porcentajeDescuento + "%");
            System.out.println("Monto del descuento: " + montoDescuento);
            System.out.println("Precio final: " + precioFinal);
        }

    }

}
