/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.factura.Factura;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author FABIAN
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Factura> listaFacturas = new ArrayList<>();
        
        listaFacturas.add(new Factura(1, "Distribuidora del Norte", 1500.50));
        listaFacturas.add(new Factura(2, "Comercial El Centro", 3200.00));
        listaFacturas.add(new Factura(3, "Distribuidora del Norte", 800.25));
        listaFacturas.add(new Factura(4, "Tech Solutions", 120.00));
        listaFacturas.add(new Factura(5, "Comercial El Centro", 450.75));

        // HashMap para almacenar el nombre del cliente y su monto total acumulado
        HashMap<String, Double> resumenVentas = new HashMap<>();

        for (Factura factura : listaFacturas) {
            String cliente = factura.getCliente();
            double montoActual = factura.getMonto();
            
            // getOrDefault busca el cliente. Si no existe, asume 0.0 y le suma el monto nuevo.
            resumenVentas.put(cliente, resumenVentas.getOrDefault(cliente, 0.0) + montoActual);
        }

        System.out.println("--- RESUMEN DE FACTURACIÓN POR CLIENTE ---");
        for (Map.Entry<String, Double> entrada : resumenVentas.entrySet()) {
            System.out.println("Cliente: " + entrada.getKey() + " | Total: Q" + entrada.getValue());
        }
    }
}