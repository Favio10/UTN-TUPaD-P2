package ecommerce;

public class TarjetaCredito implements PagoConDescuento {
    private double saldo = 0; 

    @Override
    public void procesarPago(double monto) {
        System.out.printf(" Pago Tarjeta procesado: $%.2f. Nuevo saldo: $%.2f%n", monto, saldo - monto);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.printf(" Descuento del %.0f%% aplicado para tarjeta de crédito.%n", porcentaje * 100);
    }
}