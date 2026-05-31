/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author lenovo
 */
public class Tarea6EDClase {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > LIMITE_PRODUCTOS_DESCUENTO) {
            precioProducto -= DESCUENTO_CANTIDAD;
        }
        if (numProductos != 0) {
            total = precioProducto * FACTOR_DESCUENTO_MAYOR;
            mostrarResultado(total);
        } else {
            total = precioProducto * FACTOR_DESCUENTO_MENOR;
            mostrarResultado(total);
        }

    }
    private static final double FACTOR_DESCUENTO_MENOR = 0.95;
    private static final double FACTOR_DESCUENTO_MAYOR = 0.8;
    private static final double DESCUENTO_CANTIDAD = 5.0;
    private static final int LIMITE_PRODUCTOS_DESCUENTO = 3;

    private void mostrarResultado(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
