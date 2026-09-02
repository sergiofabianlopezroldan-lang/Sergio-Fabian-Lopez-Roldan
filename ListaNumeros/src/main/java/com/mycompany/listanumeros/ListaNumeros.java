/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listanumeros;

/**
 *
 * @author FABIAN
 */import java.util.ArrayList;
import java.util.Scanner;
public class ListaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        System.out.println("\nElementos en el ArrayList:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
