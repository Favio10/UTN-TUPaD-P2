package categoriaproducto;
public class Main {
 
    public static void main(String[] args) {
        Inventario miTienda = new Inventario();
        
        // 1. creacion e insercion de productos
        Producto p1 = new Producto ("001", "Arroz", 900.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto ("002", "Yerba", 2500.0, 150, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto ("003", "Camisa", 15500.0, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto ("004", "Jeans", 9500.0, 13, CategoriaProducto.ROPA);
        Producto p5 = new Producto ("005", "Alfombra", 7550.0, 8, CategoriaProducto.HOGAR);
    
        
        miTienda.agregarProducto(p1);
        miTienda.agregarProducto(p2);
        miTienda.agregarProducto(p3);
        miTienda.agregarProducto(p4);
        miTienda.agregarProducto(p5);
        
        // 2. lista de todos los productos
        System.out.println("\n1. Listado general: ");
        miTienda.listarProductos();
        
        // 3. busqueda por id
        System.out.println("\n2. Busqueda por ID (003): ");
        miTienda.buscarProductoPorId("003");
        
        // 4. filtrado por categoria
        System.out.println("\n3. Filtro por categoria (ROPA): ");
        miTienda.filtrarPorCategoria(CategoriaProducto.ROPA);
        
        // 5. eliminacion de un producto
        System.out.println("\n4. Eliminar un producto (001): ");
        miTienda.eliminarProducto("001");
        System.out.println("-> Verificamos si se borró listando de nuevo:");
        miTienda.listarProductos();
        
        // 6. actualizar stock
        System.out.println("\n5. ACTUALIZAR STOCK (ID 002 a 300 unidades):");
        miTienda.actualizarStock("002", 300);
        
        // 7. total de Stock
        System.out.println("\n6. TOTAL DE STOCK EN TIENDA:");
        miTienda.obtenerTotalStock();
        
        // 8. producto con mayor stock
        System.out.println("\n7. PRODUCTO CON MAYOR STOCK:");
        miTienda.obtenerProductoConMayorStock();
        
        // 9. filtrar por precio (entre 1000 y 3000)
        System.out.println("\n8. FILTRO PRECIO ($1000 - $3000):");
        miTienda.filtrarProductosPorPrecio(1000, 3000);

        // 10. mostrar Categorías
        System.out.println("\n9. CATEGORIAS DISPONIBLES:");
        miTienda.mostrarCategoriasDisponibles();  
    }
}
