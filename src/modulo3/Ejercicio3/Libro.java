package modulo3.Ejercicio3;

import java.time.Year;
/**
 *
 * @author erika
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        int añoActual = Year.now().getValue();
        if (añoPublicacion >= 1900 && añoPublicacion <= añoActual){
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Error: el año debe ser entre 1900 y " + añoActual);
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + añoPublicacion);
    }
    
    
}