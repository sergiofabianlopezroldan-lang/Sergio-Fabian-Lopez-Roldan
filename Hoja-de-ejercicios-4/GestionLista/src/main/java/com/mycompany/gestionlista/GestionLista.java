/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionlista;

/**
 *
 * @author FABIAN
 */import java.util.ArrayList;
import java.util.Scanner;
public class GestionLista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar por índice");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el salto de línea
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String elemento = scanner.nextLine();
                    lista.add(elemento);
                    System.out.println("Elemento agregado correctamente.");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía. No hay elementos para eliminar.");
                    } else {
                        System.out.println("\nElementos actuales:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + ". " + lista.get(i));
                        }
                        
                        System.out.print("Ingrese el índice a eliminar: ");
                        if (scanner.hasNextInt()) {
                            int indice = scanner.nextInt();
                            scanner.nextLine();

                            // Validar que el índice exista en la lista
                            if (indice >= 0 && indice < lista.size()) {
                                String removido = lista.remove(indice);
                                System.out.println("Elemento '" + removido + "' eliminado con éxito.");
                            } else {
                                System.out.println("Error: El índice ingresado no existe.");
                            }
                        } else {
                            System.out.println("Error: Debe ingresar un número entero para el índice.");
                            scanner.nextLine();
                        }
                    }
            
                    break;
            }
        }

        scanner.close();
    }
}
