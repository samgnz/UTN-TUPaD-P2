package modulo4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // Constructor con todos los parametros
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    //Constructor recibe nombre y apellido, id random y sueldo establecido
    public Empleado(String nombre, String puesto) {
        setId((int)(Math.random() * 100000) + 1000);
        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(123456);
        totalEmpleados++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double actualizarSalario(double aumentoP){
        this.salario = salario + (salario * aumentoP);
        return this.salario;  
    }
    
    public double actualizarSalario(int aumentoF){
        this.salario = salario + aumentoF;
        return this.salario;       
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    
}
