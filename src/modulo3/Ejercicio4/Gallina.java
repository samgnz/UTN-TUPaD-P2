package modulo3.Ejercicio4;

/**
 *
 * @author erika
 */
public class Gallina {
    private int idGallina;
    private double edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public int getHuevos() {
        return huevosPuestos;
    }

    public void setHuevos(int huevos) {
        this.huevosPuestos = huevos;
    }
    
    public void mostrarEstado() {
        System.out.println("Gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Cantidad de huevos puestos: " + huevosPuestos);
    }
    
    public void envejecer(){
        edad ++;
    }
    
    public void ponerHuevo(){
        huevosPuestos ++;
    }
    
}
