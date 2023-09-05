/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrito_De_Compra;

import java.util.stream.Stream;

/**
 *
 * @author alexc
 */
public class LineaProducto {
    final Producto producto;
    final int cantidad;

    public LineaProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    Object getProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Stream<Object> getCantidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

