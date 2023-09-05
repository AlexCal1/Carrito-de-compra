/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrito_De_Compra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexc
 */
class CarritoCompra {
    private final List<LineaProducto> lineasProductos = new ArrayList<>();

    public void agregarProducto(Producto producto, int cantidad) {
        LineaProducto linea = new LineaProducto(producto, cantidad);
        lineasProductos.add(linea);
    }

    public List<LineaProducto> getLineasProductos() {
        return lineasProductos;
    }

    public double calcularTotal() {
        double total = 0;
        for (LineaProducto linea : lineasProductos) {
            total += linea.producto.getPrecio() * linea.cantidad;
        }
        return total;
    }
}



