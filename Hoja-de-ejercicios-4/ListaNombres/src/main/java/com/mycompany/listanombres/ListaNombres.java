/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listanombres;

/**
 *
 * @author FABIAN
 */import java.util.ArrayList;
import java.util.Scanner;
public class ListaNombres{
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        System.out.println("Ingresa nombres a la lista (escribe 'fin' para terminar):");

        while (true) {
            System.out.print("Nombre: ");
            entrada = scanner.nextLine();

            // Salir del bucle si el usuario escribe "fin"
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            // Agregar el nombre a la lista
            nombres.add(entrada);
        }

        // Recorrer e imprimir la lista al finalizar
        System.out.println("\n--- Lista de Nombres Registrados ---");
        if (nombres.isEmpty()) {
            System.out.println("No se ingresó ningún nombre.");
        } else {
            for (String nombre : nombres) {
                System.out.println("- " + nombre);
            }
        }

        scanner.close();
    }
}
