package ecommerce;

public class Ecommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ricardo Iorio");

        // 1. productos
        Producto p1 = new Producto("Laptop Gamer", 1500.00);
        Producto p2 = new Producto("Mouse Inalámbrico", 50.00);

        // 2. pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        double totalPedido = pedido.calcularTotal(); // 1550.00
        System.out.printf("Total a pagar por el pedido: $%.2f%n", totalPedido);

        // 3. pgo y Descuento
        TarjetaCredito pagoTarjeta = new TarjetaCredito();
        pagoTarjeta.aplicarDescuento(0.10); // 10%

        // 4. procesar pago
        pagoTarjeta.procesarPago(totalPedido * 0.90); 

        // 5. notificacion
        pedido.cambiarEstado("ENVIADO");
        pedido.cambiarEstado("ENTREGADO");
    }
}