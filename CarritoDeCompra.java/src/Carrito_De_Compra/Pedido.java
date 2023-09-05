/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrito_De_Compra;

import java.util.Date;

/**
 *
 * @author alexc
 */
class Pedido {
    private final int numeroPedido;
    private final Date fechaPedido;
    private final Cliente cliente;
    private final EstadoPedido estado;
    private CarritoCompra carrito;

    public Pedido(int numeroPedido, Date fechaPedido, Cliente cliente, EstadoPedido estado) {
        this.numeroPedido = numeroPedido;
        this.fechaPedido = fechaPedido;
        this.cliente = cliente;
        this.estado = estado;
    }

    public void setCarrito(CarritoCompra carrito) {
        this.carrito = carrito;
    }

    // Otros métodos...

    public CarritoCompra getCarrito() {
        return carrito;
    }
}
