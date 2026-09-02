/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promediocalificaciones;

/**
 *
 * @author FABIAN
 */import java.util.ArrayList;
import java.util.Scanner;
public class PromedioCalificaciones{
    public static void main(String[] args) {
        ArrayList<Double> calificaciones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        System.out.println("--- CALCULADORA DE PROMEDIO DE CALIFICACIONES ---");
        System.out.println("Ingrese las calificaciones (escribe 'fin' para terminar):");

        while (true) {
            System.out.print("Calificación: ");
            entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                double nota = Double.parseDouble(entrada);
                
                // Validar que la nota sea positiva
                if (nota >= 0 && nota <= 100) {
                    calificaciones.add(nota);
                } else {
                    System.out.println("Por favor, ingrese una nota válida entre 0 y 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido o la palabra 'fin'.");
            }
        }

        // Mostrar resultados y calcular el promedio
        System.out.println("\n--- RESULTADOS ---");
        if (calificaciones.isEmpty()) {
            System.out.println("No se ingresaron calificaciones.");
        } else {
            double suma = 0;
            System.out.println("Calificaciones ingresadas:");
            for (int i = 0; i < calificaciones.size(); i++) {
                System.out.println("Nota " + (i + 1) + ": " + calificaciones.get(i));
                suma += calificaciones.get(i);
            }

            double promedio = suma / calificaciones.size();
            System.out.println("\nNúmero total de notas: " + calificaciones.size());
            System.out.printf("Promedio final: %.2f\n", promedio);
        }

        scanner.close();
    }
}