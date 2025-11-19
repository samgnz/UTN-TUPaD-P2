package modulo8.ecommerce.mediosPago;

import modulo8.ecommerce.interfaces.*;

public class PayPal implements PagoConDescuento {

    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public void aplicarDescuento(double monto) {
        double descuento = 0.1;
        this.monto = monto - (descuento * monto);
        System.out.println("El monto con descuento es de: " + this.monto);
    }

}
