package modulo6.ejercicio2;

/**
 Se debe desarrollar un sistema para gestionar una biblioteca, en la cual se 
registren los libros disponibles y sus autores. La relación central es de 
composición 1 a N: una Biblioteca contiene múltiples Libros, y cada Libro 
pertenece obligatoriamente a una Biblioteca. Si la Biblioteca se elimina, también se 
eliminan sus Libros.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");

        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A003", "Julio Cortázar", "Argentina");

        biblioteca.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "El Amor en los Tiempos del Cólera", 1985, a1);
        biblioteca.agregarLibro("ISBN003", "El Aleph", 1949, a2);
        biblioteca.agregarLibro("ISBN004", "Historia de la noche", 1977, a2);
        biblioteca.agregarLibro("ISBN005", "Rayuela", 1963, a3);

        System.out.println("Listado de libros: ");
        biblioteca.listarLibros();

        System.out.println("Buscar libro: ");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("Filtrar por año: ");
        biblioteca.filtrarLibrosPorAnio(1997);

        System.out.println("Eliminar libro: ");
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        System.out.println("Total de libros: " + biblioteca.obtenerCantidadLibros());

        System.out.println("Autores disponibles: ");
        biblioteca.mostrarAutoresDisponibles();
        
    }
    
}
