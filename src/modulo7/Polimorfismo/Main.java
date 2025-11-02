package modulo7.Polimorfismo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta(1526698.52, "Juan Perez"));
        empleados.add(new EmpleadoTemporal(24506.23, 150, "Maria Garcia"));

        for (Empleado emp : empleados) {
            String tipo = (emp instanceof EmpleadoPlanta) ? "Planta" : "Temporal";
            System.out.println(emp.getNombre() + " - Tipo trabajador: "+ tipo + " - Sueldo: " + emp.calcularSueldo());
        }

    }

}
