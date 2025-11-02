package modulo6.ejercicio1;

/**
 Se debe desarrollar un sistema de stock que permita gestionar productos en 
una tienda, controlando su disponibilidad, precios y categorías. La información se 
modelará utilizando clases, colecciones dinámicas y enumeraciones en Java.
 */
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("AL-01", "Harina", 500, 250, CategoriaProducto.ALIMENTOS);
        Producto producto2 = new Producto("EL-01", "Celular", 150800, 10, CategoriaProducto.ELECTRONICA);
        Producto producto3 = new Producto("RO-01", "Remera lisa", 1100, 650, CategoriaProducto.ROPA);
        Producto producto4 = new Producto("HO-01", "Lampara", 2000, 1555, CategoriaProducto.HOGAR);
        Producto producto5 = new Producto("AL-02", "Bebida gaseosa", 200, 920, CategoriaProducto.ALIMENTOS);
        Producto producto6 = new Producto("RO-02", "Pantalon", 2800, 300, CategoriaProducto.ROPA);


        Inventario inv = new Inventario();
        inv.agregarProducto(producto1);
        inv.agregarProducto(producto2);
        inv.agregarProducto(producto3);
        inv.agregarProducto(producto4);
        inv.agregarProducto(producto5);
        inv.agregarProducto(producto6);
        
        System.out.println("Listado de productos:");
        inv.listarProductos();
        
        System.out.println("Buscar producto por ID: ");
        Producto buscado = inv.buscarProductoPorId("AL-02");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("Filtrar producto por categoria: ");
        inv.filtrarPorCategoria(CategoriaProducto.ROPA);
        
        System.out.println("Eliminar producto: ");
        inv.eliminarProducto("RO-01");
        inv.listarProductos();
        
        System.out.println("Actualizar stock");
        inv.actualizarStock("HO-01", 5);
        producto4.mostrarInfo();
        
        System.out.println("Total stock: " + inv.obtenerTotalStock());
       
        System.out.println("Producto con mayor stock:" + inv.obtenerProductoConMayorStock());

        System.out.println("Filtrar por rango de precios: ");
        inv.filtrarProductoPorPrecio(1000, 3000);
        
        System.out.println("Lista de categorias disponibles: ");
        inv.mostrarCategoriasDisponibles();
        
        
    
        
    }
    
}
