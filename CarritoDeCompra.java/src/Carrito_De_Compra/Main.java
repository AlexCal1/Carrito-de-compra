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
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nombreCliente, direccionCliente);

        System.out.println("\nIngrese los datos del producto:");
        System.out.print("Nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.print("Precio del producto: ");
        double precioProducto = scanner.nextDouble();
        Producto producto = new Producto(nombreProducto, precioProducto);

        CarritoCompra carrito = new CarritoCompra();
        System.out.print("\nIngrese la cantidad del producto en el carrito: ");
        int cantidadProducto = scanner.nextInt();
        carrito.agregarProducto(producto, cantidadProducto);

        System.out.println("\nIngrese los datos del pedido:");
        System.out.print("Número del pedido: ");
        int numeroPedido = scanner.nextInt();
        Pedido pedido = new Pedido(numeroPedido, new Date(), cliente, EstadoPedido.PENDIENTE);
        pedido.setCarrito(carrito);

        double totalCarrito = carrito.calcularTotal();
        Pago pago = new Pago(pedido, totalCarrito, MetodoPago.TARJETA_CREDITO);
        Envio envio = new Envio(pedido, "Dirección de envío", EstadoEnvio.EN_TRANSITO);

        // Mostrar detalles
        System.out.println("\nDetalles del Cliente:");
        System.out.println(cliente);

        System.out.println("\nDetalles del Producto:");
        System.out.println(producto);

        System.out.println("\nDetalles del Carrito de Compra:");
        System.out.println(carrito);

        System.out.println("\nDetalles del Pedido:");
        System.out.println(pedido);

        System.out.println("\nDetalles del Pago:");
        System.out.println(pago);

        System.out.println("\nDetalles del Envío:");
        System.out.println(envio);
    }
}


