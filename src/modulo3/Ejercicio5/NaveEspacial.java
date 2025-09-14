package modulo3.Ejercicio5;

/**
 *
 * @author erika
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE = 100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
        
    
    
    public void despegar(){ //reduce 10 unidades al despegar - no puede despegar si hay menos de 10 unidades
        if (combustible >=10){
            combustible -= 10;
            System.out.println("¡Despegue exitoso! Combustible restante: " + combustible);                    
        } else {
            System.out.println("No se puede despegar. Se necesitan al menos 10 unidades de combustible");
           }                       
    }
    
    
    public void avanzar(int distancia){ //consume 1 unidad de conbustible por cada unidda de distancia
        if (combustible >= distancia){
            combustible -= 10;
            System.out.println("La nave ha avanzado "+ distancia + " unidades. Combustible restante: " + combustible);                    
        } else {
            System.out.println("No se puede avanzar. Combustible disponible:" + combustible);
           }                       
    }
       
    
    public void recargarCombustible(int cantidad){ //no puede superar las 100 unidades
        if (cantidad <= 0 ){
            System.out.println("No se puede agregar cantidad negativa de combustible.");                    
        }
        if (combustible + cantidad > MAX_COMBUSTIBLE){
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Combustible recargado al maximo de 100 unidades");            
        }else {
            combustible += cantidad;
            System.out.println("La nave ha recargado " + cantidad + "unidades. Combustible actual: " + combustible);
           }         
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println("Combustible disponible: " + combustible + " unidades");
        System.out.println("----------------------------------------------------");
    }
}
