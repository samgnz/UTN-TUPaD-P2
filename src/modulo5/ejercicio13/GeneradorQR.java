/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo5.ejercicio13;

/**
 *
 * @author erika
 */
public class GeneradorQR {
    public void generar(int valor, Usuario usuario){
        CodigoQR nuevoQR = new CodigoQR(valor, usuario);
        System.out.println("Usuario: " + nuevoQR.getUsuario() + "\nCodigo QR: " + nuevoQR.getValor());
    }
}
