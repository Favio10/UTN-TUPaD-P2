package categoriaproducto;
import java.util.ArrayList;
public class Inventario {
    
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
    
    public void buscarProductoPorId(String id) {
        for (Producto p: productos) {
            if (p.getId().equals(id)) {
                p.mostrarInfo();
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }
    
    public void eliminarProducto(String id) {
        for (Producto p: productos) {
            if (p.getId().equals(id)) {
                productos.remove(p);
                System.out.println("Producto con ID " + id + " eliminado.");
                return;
            }
        }
        System.out.println("Producto ID "+id+" no encontrado.");
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        for (Producto p: productos) {
            if (p.getId().equals(id)) {
                p.setCantidad(nuevaCantidad);
                System.out.println("Stock actualizado. Nuevo stock: " + nuevaCantidad);
                return;
            }
        }
        System.out.println("No se pudo actualizar: Producto no encontrado.");
    }
    
    public void obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total = total + p.getCantidad();
        }
        System.out.println("El total de productos es "+ total);
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        boolean hayCoincidencias = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                hayCoincidencias = true;
            }
        }
       if (!hayCoincidencias) {
        System.out.println("No hay productos en esta categoría.");
       }
    }
    
    public void obtenerProductoConMayorStock() {
        Producto mayor = null;
        int maxStock = -1;
        for (Producto p : productos) {
            if (p.getCantidad() > maxStock) {
                maxStock = p.getCantidad();
                mayor = p;
            }
        }
        
        if(mayor != null) {
            System.out.println("Producto con mayor stock: ");
            mayor.mostrarInfo();
        }
        else {
            System.out.println("Inventario vacio.");
        }
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        boolean huboCoincidencias = false;
        for (Producto p : productos) {
            if(p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                huboCoincidencias = true;
            }
        }
        if (!huboCoincidencias) {
            System.out.println("No hay producto entre $"+min+" y $"+max);
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorias registradas: ");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c + ": " + c.getDescripcion());
        }
    }
}
