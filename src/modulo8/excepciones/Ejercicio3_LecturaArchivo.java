package modulo8.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
3. Lectura de archivo 
    ○ Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe. 
*/

public class Ejercicio3_LecturaArchivo {
    public static void main(String[] args) {
        
        String path = "C:\\Users\\erika\\OneDrive - TUPAD UTN\\TUPd-od\\2.Programacion II\\repo-programacion2\\UTN-TUPaD-P2\\src\\modulo8\\excepciones\\noexiste.txt";
        //String path = "C:\\Users\\erika\\OneDrive - TUPAD UTN\\TUPd-od\\2.Programacion II\\repo-programacion2\\UTN-TUPaD-P2\\src\\modulo8\\excepciones\\test.txt";

        try {
            Scanner s = new Scanner(new File(path));
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }
    }
    
}
