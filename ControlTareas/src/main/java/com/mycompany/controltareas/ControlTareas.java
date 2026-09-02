/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controltareas;

/**
 *
 * @author FABIAN
 */import java.util.ArrayList;
import java.util.Scanner;
public class ControlTareas {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equals("4")) {
            System.out.println("\n--- GESTOR DE TAREAS PENDIENTES ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tareas pendientes");
            System.out.println("3. Marcar tarea como completada (Eliminar)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String nuevaTarea = scanner.nextLine().trim();
                    if (!nuevaTarea.isEmpty()) {
                        tareas.add(nuevaTarea);
                        System.out.println("-> Tarea agregada con éxito.");
                    } else {
                        System.out.println("Error: No se ingresó ninguna tarea.");
                    }
                    break;

                case "2":
                    System.out.println("\n--- LISTA DE TAREAS PENDIENTES ---");
                    if (tareas.isEmpty()) {
                        System.out.println("¡No hay tareas pendientes!");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;

                case "3":
                    if (tareas.isEmpty()) {
                        System.out.println("La lista está vacía. No hay tareas para completar.");
                    } else {
                        System.out.println("\nTareas actuales:");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                        
                        System.out.print("Ingrese el número de la tarea a marcar como completada: ");
                        try {
                            int numero = Integer.parseInt(scanner.nextLine().trim());
                            int indice = numero - 1; // Convertir número a índice (base 0)

                            if (indice >= 0 && indice < tareas.size()) {
                                String tareaCompletada = tareas.remove(indice);
                                System.out.println("-> ¡Excelente! Se completó y eliminó: '" + tareaCompletada + "'");
                            } else {
                                System.out.println("Error: El número ingresado no está en la lista.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número entero válido.");
                        }
                    }
                    break;

                case "4":
                    System.out.println("Saliendo del gestor de tareas...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}