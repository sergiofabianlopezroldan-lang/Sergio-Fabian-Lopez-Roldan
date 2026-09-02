/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscarnombre;

/**
 *
 * @author FABIAN
 */import java.util.ArrayList;
import java.util.Scanner;
public class BuscarNombre {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 1. Cargar la lista con algunos nombres
        nombres.add("Carlos");
        nombres.add("María");
        nombres.add("Juan");
        nombres.add("Ana");

        System.out.println("Lista actual de nombres: " + nombres);

        // 2. Pedir al usuario el nombre a buscar
        System.out.print("\nIngrese el nombre que desea buscar: ");
        String nombreBuscado = scanner.nextLine().trim();

        // 3. Verificar la existencia usando contains()
        if (nombres.contains(nombreBuscado)) {
            System.out.println("¡El nombre '" + nombreBuscado + "' SÍ existe en la lista!");
        } else {
            System.out.println("El nombre '" + nombreBuscado + "' NO se encuentra en la lista.");
        }

        scanner.close();
    }
}