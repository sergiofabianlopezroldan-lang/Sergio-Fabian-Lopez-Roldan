/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FABIAN
 package com.mycompany.itemcarrito;*/
import com.mycompany.itemcarrito.ItemCarrito;
import java.util.ArrayList;

public class CarritoCompras {
    
    private ArrayList<ItemCarrito> carrito;

    public CarritoCompras() {
        this.carrito = new ArrayList<>();
    }

    public void agregarItem(String producto, int cantidad, double precioUnitario) {
        for (ItemCarrito item : carrito) {
            if (item.getProducto().equalsIgnoreCase(producto)) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }
        carrito.add(new ItemCarrito(producto, cantidad, precioUnitario));
    }

    public void eliminarItem(String producto) {
        for (int i = 0; i < carrito.size(); i++) {
            if (carrito.get(i).getProducto().equalsIgnoreCase(producto)) {
                carrito.remove(i);
                break;
            }
        }
    }

    public void vaciarCarrito() {
        carrito.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : carrito) {
            total += item.getCantidad() * item.getPrecioUnitario();
        }
        return total;
    }

    public void mostrarCarrito() {
        for (ItemCarrito item : carrito) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        CarritoCompras miCarrito = new CarritoCompras();

        miCarrito.agregarItem("Camiseta", 2, 15.50);
        miCarrito.agregarItem("Pantalon", 1, 30.00);
        miCarrito.agregarItem("Zapatos", 1, 50.00);
        
        miCarrito.agregarItem("Camiseta", 3, 15.50);

        System.out.println("Contenido del carrito:");
        miCarrito.mostrarCarrito();
        System.out.println("Total: Q" + miCarrito.calcularTotal());

        miCarrito.eliminarItem("Pantalon");

        System.out.println("\nContenido despues de eliminar Pantalon:");
        miCarrito.mostrarCarrito();
        System.out.println("Total: Q" + miCarrito.calcularTotal());

        miCarrito.vaciarCarrito();
        
        System.out.println("\nContenido despues de vaciar el carrito:");
        miCarrito.mostrarCarrito();
        System.out.println("Total: Q" + miCarrito.calcularTotal());
    }
}