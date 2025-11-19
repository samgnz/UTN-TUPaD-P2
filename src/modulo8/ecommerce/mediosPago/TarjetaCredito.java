package modulo8.ecommerce.mediosPago;

import modulo8.ecommerce.interfaces.*;

public class TarjetaCredito implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }

}
