package modulo7.Polimorfismo;

public class EmpleadoTemporal extends Empleado {

    private double valorHora;
    private int cantidadHorasTrabajadas;

    public EmpleadoTemporal(double valorHora, int cantidadHorasTrabajadas, String nombre) {
        super(nombre);
        this.valorHora = valorHora;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return valorHora * cantidadHorasTrabajadas;
    }

}
