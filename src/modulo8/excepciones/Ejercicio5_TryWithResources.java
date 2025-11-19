package modulo8.excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
5.Uso de try-with-resources 
    ○ Leer un archivo con BufferedReader usando try-with-resources. Manejar IOException correctamente. 
*/

public class Ejercicio5_TryWithResources {

    public static void main(String[] args) {
        String path = "C:\\Users\\erika\\OneDrive - TUPAD UTN\\TUPd-od\\2.Programacion II\\repo-programacion2\\UTN-TUPaD-P2\\src\\modulo8\\excepciones\\test.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
