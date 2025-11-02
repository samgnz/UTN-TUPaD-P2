package modulo6.ejercicio1;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }

//    public Producto buscarProductoPorId(String id) {
//        int i = 0;
//        Producto prodEncontrado = null;
//
//        while (i < productos.size() && !this.productos.get(i).getId().equals(id)) {
//            i++;
//        }
//        if (i < productos.size()) {
//            prodEncontrado = this.productos.get(i);
//        }
//        return prodEncontrado;
//    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto prod : productos) {
            if (prod.getId().equalsIgnoreCase(id)) {
                return prod;
            }
        }
        return null;
    } 

    public Producto eliminarProducto(String id) {
        Producto prodBorrar = buscarProductoPorId(id);
        this.productos.remove(prodBorrar);
        return prodBorrar;
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        for (Producto prod : productos) {
            if (prod.getId().equals(id)) {
                prod.setCantidad(nuevaCantidad);
                break;
            }
        }
    }

//    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
//        ArrayList<Producto> lista = new ArrayList<>();
//        for (Producto prod : productos) {
//            if (prod.getCategoria() == categoria) {
//                lista.add(prod);
//            }
//        }
//        return lista;
//    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }

    public int obtenerTotalStock() {
        int totalCantidad = 0;
        for (Producto prod : productos) {
            totalCantidad += prod.getCantidad();
        }
        return totalCantidad;
    }

    public ArrayList<Producto> obtenerProductoConMayorStock() {
        ArrayList<Producto> mayorStock = new ArrayList<>();
        int stock = -1;

        for (Producto prod : productos) {
            if (prod.getCantidad() == stock) {
                mayorStock.add(prod);
            } else if (prod.getCantidad() > stock) {
                stock = prod.getCantidad();
                mayorStock.clear();
                mayorStock.add(prod);
            }
        }
        return mayorStock;
    }

//    public ArrayList<Producto> filtrarProductoPorPrecio(double min, double max) {
//        ArrayList<Producto> lista = new ArrayList<>();
//        for (Producto prod : productos) {
//            if (min < prod.getPrecio() && prod.getPrecio() > max) {
//                lista.add(prod);
//            }
//        }
//        return lista;
//    }
    
    public void filtrarProductoPorPrecio(double min, double max) {
        for (Producto prod : productos) {
            if (prod.getPrecio() >= min && prod.getPrecio() <= max) {
                prod.mostrarInfo();
            }
        }
    }

    public void mostrarCategoriasDisponibles() {
        ArrayList<CategoriaProducto> categorias = new ArrayList<>();

        for (Producto prod : productos) {
            if (!categorias.contains(prod.getCategoria())) {
                categorias.add(prod.getCategoria());
            }
        }

        System.out.println("Categorías disponibles:");
        for (CategoriaProducto cat : categorias) {
            System.out.println("- " + cat);
        }
    }

}
