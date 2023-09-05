/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrito_De_Compra;

/**
 *
 * @author alexc
 */
class Pago {
    private final Pedido pedido;
    private final double monto;
    private final MetodoPago metodoPago;

    public Pago(Pedido pedido, double monto, MetodoPago metodoPago) {
        this.pedido = pedido;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public double getMonto() {
        return monto;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}


