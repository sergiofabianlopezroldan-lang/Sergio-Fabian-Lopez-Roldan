/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.historialnavegacion;
import java.util.ArrayList;
/**
 *
 * @author FABIAN
 */
public class HistorialNavegacion {
    
    private ArrayList<String> historial;

    public HistorialNavegacion() {
        this.historial = new ArrayList<>();
    }

    public void visitarPagina(String url) {
        historial.add(url);
        if (historial.size() > 10) {
            historial.remove(0);
        }
    }

    public void mostrarHistorial() {
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }
    }

    public static void main(String[] args) {
        HistorialNavegacion navegador = new HistorialNavegacion();

        navegador.visitarPagina("google.com");
        navegador.visitarPagina("youtube.com");
        navegador.visitarPagina("github.com");
        navegador.visitarPagina("stackoverflow.com");
        navegador.visitarPagina("wikipedia.org");
        navegador.visitarPagina("reddit.com");
        navegador.visitarPagina("netflix.com");
        navegador.visitarPagina("amazon.com");
        navegador.visitarPagina("twitch.tv");
        navegador.visitarPagina("x.com");

        System.out.println("Historial actual (10 paginas):");
        navegador.mostrarHistorial();

        navegador.visitarPagina("oracle.com");
        navegador.visitarPagina("java.com");

        System.out.println("\nHistorial tras visitar 2 nuevas paginas:");
        navegador.mostrarHistorial();
    }
}