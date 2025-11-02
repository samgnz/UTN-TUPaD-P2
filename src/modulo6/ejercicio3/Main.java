package modulo6.ejercicio3;

/*
Se debe modelar un sistema académico donde un Profesor dicta muchos Cursos y 
cada Curso tiene exactamente un Profesor responsable. La relación Profesor
Curso es bidireccional
 */
public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        Profesor p1 = new Profesor("P001", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P002", "Carlos Pérez", "Programación");
        Profesor p3 = new Profesor("P003", "María Gómez", "Historia");

        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "Estructuras de Datos");
        Curso c3 = new Curso("C003", "Historia Universal");
        Curso c4 = new Curso("C004", "Bases de Datos");
        Curso c5 = new Curso("C005", "Análisis Matemático");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C001", "P001");
        uni.asignarProfesorACurso("C005", "P001");
        uni.asignarProfesorACurso("C002", "P002");
        uni.asignarProfesorACurso("C004", "P002");
        uni.asignarProfesorACurso("C003", "P003");

        System.out.println("Listado de cursos: ");
        uni.listarCursos();
        System.out.println("Listado de profesores: ");
        uni.listarProfesores();

        System.out.println("Asignar profesor a curso: ");
        uni.asignarProfesorACurso("C001", "P002");
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("Eliminar curso");
        uni.eliminarCurso("C004");
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("Eliminar profesor: ");
        uni.eliminarProfesor("P001");
        uni.listarProfesores();
        uni.listarCursos();

        System.out.println("Cursos por profesor: ");
        uni.reporteCursosPorProfesor();
    }
    
}
