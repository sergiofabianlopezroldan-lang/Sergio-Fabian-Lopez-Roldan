/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventasmensuales;
import java.util.ArrayList;
/**
 *
 * @author FABIAN
 */
public class VentasMensuales {

  public static double calcularPromedio(ArrayList<Double> ventas) {
        double suma = 0;
        for (double venta : ventas) {
            suma += venta;
        }
        return suma / ventas.size();
    }

    public static double obtenerMaximo(ArrayList<Double> ventas) {
        double maximo = ventas.get(0);
        for (double venta : ventas) {
            if (venta > maximo) {
                maximo = venta;
            }
        }
        return maximo;
    }

    public static double obtenerMinimo(ArrayList<Double> ventas) {
        double minimo = ventas.get(0);
        for (double venta : ventas) {
            if (venta < minimo) {
                minimo = venta;
            }
        }
        return minimo;
    }

    public static int contarDiasSobrePromedio(ArrayList<Double> ventas, double promedio) {
        int contador = 0;
        for (double venta : ventas) {
            if (venta > promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        ArrayList<Double> ventasDiarias = new ArrayList<>();
        
        ventasDiarias.add(1500.50);
        ventasDiarias.add(2100.00);
        ventasDiarias.add(850.25);
        ventasDiarias.add(3200.00);
        ventasDiarias.add(1120.00);
        ventasDiarias.add(4500.75);
        ventasDiarias.add(980.00);
        ventasDiarias.add(2300.00);
        ventasDiarias.add(1750.50);
        ventasDiarias.add(1950.00);

        double promedio = calcularPromedio(ventasDiarias);
        double maximo = obtenerMaximo(ventasDiarias);
        double minimo = obtenerMinimo(ventasDiarias);
        int diasSobrePromedio = contarDiasSobrePromedio(ventasDiarias, promedio);

        System.out.println("Promedio mensual: " + promedio);
        System.out.println("Venta maxima: " + maximo);
        System.out.println("Venta minima: " + minimo);
        System.out.println("Dias con ventas superiores al promedio: " + diasSobrePromedio);
    }
}