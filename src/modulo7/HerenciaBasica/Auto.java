package modulo7.HerenciaBasica;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Modelo: " + this.modelo + ", marca: " + this.marca + ", cantidad de puertas: " + cantidadPuertas);
    }
    
    
}
