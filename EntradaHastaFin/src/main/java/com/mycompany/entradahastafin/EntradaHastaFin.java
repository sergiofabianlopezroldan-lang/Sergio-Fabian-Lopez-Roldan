/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entradahastafin;

/**
 *
 * @author FABIAN
 */import java.util.Scanner;
public class EntradaHastaFin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        System.out.println("Ingresa texto (escribe 'fin' para terminar):");

        while (!entrada.equalsIgnoreCase("fin")) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            if (!entrada.equalsIgnoreCase("fin")) {
                System.out.println("Ingresaste: " + entrada);
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
