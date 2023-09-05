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

class Envio {
    private final Pedido pedido;
    private final String direccionEnvio;
    private final EstadoEnvio estado;

    public Envio(Pedido pedido, String direccionEnvio, EstadoEnvio estado) {
        this.pedido = pedido;
        this.direccionEnvio = direccionEnvio;
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public EstadoEnvio getEstado() {
        return estado;
    }
}

