/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo7.Comportamiento;

/**
 *
 * @author erika
 */
public class Perro extends Animal{
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(nombre + " está ladrando");
    }
    
}
