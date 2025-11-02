package modulo7.Polimorfismo;

public class EmpleadoPlanta extends Empleado{
    private double sueldo;

    public EmpleadoPlanta(double sueldo, String nombre) {
        super(nombre);
        this.sueldo = sueldo;
    }
    
    @Override
  public double calcularSueldo(){
      return sueldo;
  }
    
}
