/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaempleados;

/**
 *
 * @author FABIAN
 */import java.util.ArrayList;
import java.util.Scanner;
public class ProgramaEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        System.out.println("--- REGISTRO DE EMPLEADOS Y CÁLCULO DE SALARIOS ---");

        while (true) {
            System.out.print("\nIngrese el nombre del empleado (o escriba 'fin' para terminar): ");
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingrese el salario de " + nombre + ": ");
            try {
                double salario = Double.parseDouble(scanner.nextLine().trim());

                if (salario >= 0) {
                    // Se crea el objeto Empleado y se agrega al ArrayList
                    listaEmpleados.add(new Empleado(nombre, salario));
                    System.out.println("-> Empleado registrado con éxito.");
                } else {
                    System.out.println("Error: El salario no puede ser negativo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un valor numérico válido para el salario.");
            }
        }

        // Cálculo del promedio
        System.out.println("\n--- RESULTADOS ---");
        if (listaEmpleados.isEmpty()) {
            System.out.println("No se registraron empleados.");
        } else {
            double sumaSalarios = 0;

            System.out.println("Lista de empleados registrados:");
            for (Empleado emp : listaEmpleados) {
                System.out.println("- " + emp.getNombre() + ": Q" + String.format("%.2f", emp.getSalario()));
                sumaSalarios += emp.getSalario();
            }

            double promedio = sumaSalarios / listaEmpleados.size();

            System.out.println("\nTotal de empleados: " + listaEmpleados.size());
            System.out.printf("Promedio de salarios: Q%.2f\n", promedio);
        }

        scanner.close();
    }
}