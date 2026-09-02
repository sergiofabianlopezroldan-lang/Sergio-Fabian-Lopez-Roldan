/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filtrarpares;

/**
 *
 * @author FABIAN
 */import java.util.ArrayList;
import java.util.Scanner;
public class FiltrarPares {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        System.out.println("--- FILTRADOR DE NÚMEROS PARES ---");
        System.out.println("Ingrese números enteros (escriba 'fin' para terminar):");

        // 1. Lectura de datos
        while (true) {
            System.out.print("Número: ");
            entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido o 'fin'.");
            }
        }

        // 2. Filtrado de números pares
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        // 3. Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Lista completa de números ingresados: " + numeros);

        if (pares.isEmpty()) {
            System.out.println("No se encontraron números pares en la lista.");
        } else {
            System.out.println("Números pares filtrados: " + pares);
        }

        scanner.close();
    }
}