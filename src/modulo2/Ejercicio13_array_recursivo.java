package modulo2;


public class Ejercicio13_array_recursivo {
    public static void main(String[] args) {
        double[] precios = {19.1, 542, 48.3, 399, 88.7};
        
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        precios[4] = 98;
        
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
        
    }
    
    static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        
        System.out.println("Precio: $" + precios[indice]);
        
        mostrarPreciosRecursivo(precios, indice + 1);
    }
    
}
