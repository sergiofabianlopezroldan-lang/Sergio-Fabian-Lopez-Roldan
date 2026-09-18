/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosaleatorios;

/**
 *
 * @author FABIAN
 */import java.util.ArrayList;
import java.util.Random;
public class NumerosAleatorios {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Generar y agregar 20 números aleatorios (entre 1 y 100)
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(100) + 1; // Valores de 1 a 100
            numeros.add(numeroAleatorio);
        }

        // Mostrar la lista de números generados
        System.out.println("--- LISTA DE 20 NÚMEROS ALEATORIOS ---");
        System.out.println(numeros);

        // Ejemplo de recorrido individual con bucle for-each
        System.out.println("\nElementos generados:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Posición [" + i + "]: " + numeros.get(i));
        }
    }
}
