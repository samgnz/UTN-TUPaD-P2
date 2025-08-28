package modulo2;

public class Ejercicio12_array_precios {
    public static void main(String[] args) {
        double[] precios = {123.45, 12.8, 47, 90.1, 652.58};
        
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        precios[2] = 111.22;
        
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
    }
    
}
