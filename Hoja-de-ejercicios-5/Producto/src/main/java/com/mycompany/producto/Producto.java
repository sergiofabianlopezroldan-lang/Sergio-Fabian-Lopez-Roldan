/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.producto;
import java.util.ArrayList;
/**
 *
 * @author FABIAN
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Producto {id=" + id + ", nombre='" + nombre + "', precio=" + precio + ", stock=" + stock + "}";
    }

    public static void actualizarPreciosPorStock(ArrayList<Producto> listaProductos, double porcentajeAumento) {
        for (Producto producto : listaProductos) {
            if (producto.getStock() < 10) {
                double precioActual = producto.getPrecio();
                double nuevoPrecio = precioActual * (1 + (porcentajeAumento / 100));
                producto.setPrecio(nuevoPrecio);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();

        inventario.add(new Producto(1, "Laptop", 850.00, 5));
        inventario.add(new Producto(2, "Mouse", 25.50, 15));
        inventario.add(new Producto(3, "Teclado", 45.00, 8));
        inventario.add(new Producto(4, "Monitor", 200.00, 20));
        inventario.add(new Producto(5, "USB 64GB", 15.00, 3));

        System.out.println("--- PRECIOS ANTES DEL AUMENTO ---");
        for (Producto p : inventario) {
            System.out.println(p);
        }

        double porcentaje = 15.0;
        actualizarPreciosPorStock(inventario, porcentaje);

        System.out.println("\n--- PRECIOS DESPUÉS DEL AUMENTO (" + porcentaje + "%) ---");
        for (Producto p : inventario) {
            System.out.println(p);
        }
    }
}