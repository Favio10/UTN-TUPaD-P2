package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente; 

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal(); 
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        String mensaje = String.format("Su pedido (Total: $%.2f) ha cambiado a estado: %s", calcularTotal(), nuevoEstado);
        
        cliente.notificar(mensaje); 
    }
}