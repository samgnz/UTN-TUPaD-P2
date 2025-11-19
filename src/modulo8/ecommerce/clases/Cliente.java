package modulo8.ecommerce.clases;

import modulo8.ecommerce.interfaces.*;

public class Cliente implements Notificable {

    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(mensaje);
    }

}


