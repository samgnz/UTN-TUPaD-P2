package modulo7.MetodosAbstractos;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Rectangulo r1 = new Rectangulo(8.5,5.2,"Rectangulo");
        Circulo c1 = new Circulo(12.2, "Circulo");
        
        figuras.add(c1);
        figuras.add(r1);
        
        for(Figura f : figuras){
            System.out.println("Figura: " + f.nombre + ", area: " +f.calcularArea());
        }
    }
    
}


