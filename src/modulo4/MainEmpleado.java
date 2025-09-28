package modulo4;

public class MainEmpleado {
    public static void main(String[] args) {
       Empleado empleado_completo = new Empleado(10012, "Juan Perez", "Desarrollador", 1222333);
        Empleado empleado_nombreypuesto = new Empleado("Maria Gomez", "Desarrolladora");
        Empleado empleado_3 = new Empleado(10020, "Tomas Sanchez", "Disenador", 888999);
        
        System.out.println(empleado_completo);
        System.out.println(empleado_nombreypuesto);
        System.out.println(empleado_3);
        
        empleado_nombreypuesto.actualizarSalario(11.2);
        empleado_3.actualizarSalario(25000);
        
        System.out.println(empleado_completo);
        System.out.println(empleado_nombreypuesto);
        System.out.println(empleado_3);
        
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());

    }
    
}
