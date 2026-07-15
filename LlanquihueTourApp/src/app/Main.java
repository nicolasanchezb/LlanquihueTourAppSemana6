package app;

import data.DataLoader;
import gui.VentanaPrincipal;
import interfaces.Registrable;
import model.*;

import javax.swing.SwingUtilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        try {

            // ===============================
            // Cargar clientes desde archivo TXT
            // ===============================
            ArrayList<Cliente> clientes = DataLoader.cargarClientes("src/data/clientes.txt");

            if (clientes.isEmpty()) {
                System.out.println("No se encontraron clientes en el archivo.");
                return;
            }

            // ===============================
            // Mostrar clientes
            // ===============================
            System.out.println("===== CLIENTES =====");

            for (Cliente cliente : clientes) {
                System.out.println(cliente);
                System.out.println();
            }

            // ===============================
            // HashMap
            // ===============================
            HashMap<String, Cliente> mapaClientes = new HashMap<>();

            for (Cliente cliente : clientes) {
                mapaClientes.put(cliente.getRut().getRut(), cliente);
            }

            System.out.println("===== BÚSQUEDA POR RUT =====");

            Cliente encontrado = mapaClientes.get("12345678-5");

            if (encontrado != null) {
                System.out.println(encontrado);
            } else {
                System.out.println("Cliente no encontrado.");
            }

            // ===============================
            // Crear guía turístico
            // ===============================
            GuiaTuristico guia = new GuiaTuristico(
                    "Carlos González",
                    new Rut("11111111-1"),
                    new Direccion("Centro", "Puerto Varas", "Los Lagos"),
                    "Turismo Cultural"
            );

            // ===============================
            // Servicios turísticos
            // ===============================
            ServicioTuristico servicio1 = new RutaGastronomica(
                    "Ruta Gastronómica",
                    45000,
                    guia,
                    5
            );

            ServicioTuristico servicio2 = new PaseoLacustre(
                    "Paseo Lago Llanquihue",
                    35000,
                    guia,
                    "Lago Llanquihue"
            );

            ServicioTuristico servicio3 = new ExcursionCultural(
                    "Frutillar Histórico",
                    30000,
                    guia,
                    "Frutillar"
            );

            System.out.println("\n===== SERVICIOS =====");
            System.out.println(servicio1);
            System.out.println();
            System.out.println(servicio2);
            System.out.println();
            System.out.println(servicio3);

            // ===============================
            // Productos
            // ===============================
            Producto producto1 = new Producto("Ticket Tour", 45000);
            Producto producto2 = new Producto("Seguro de Viaje", 5000);

            // ===============================
            // Orden de compra
            // ===============================
            OrdenDeCompra orden = new OrdenDeCompra(1, clientes.get(0));

            orden.agregarProducto(producto1);
            orden.agregarProducto(producto2);

            System.out.println("\n===== ORDEN DE COMPRA =====");
            System.out.println(orden);

            // ===============================
            // Stack
            // ===============================
            Stack<OrdenDeCompra> historial = new Stack<>();

            historial.push(orden);

            System.out.println("\n===== HISTORIAL =====");

            while (!historial.isEmpty()) {
                System.out.println(historial.pop());
            }

            // ===============================
            // instanceof
            // ===============================
            ArrayList<Registrable> registros = new ArrayList<>();

            registros.add(clientes.get(0));
            registros.add(guia);

            Proveedor proveedor = new Proveedor(
                    "Pedro Díaz",
                    new Rut("22222222-2"),
                    new Direccion(
                            "Centro",
                            "Llanquihue",
                            "Los Lagos"
                    ),
                    "Turismo Patagonia"
            );

            registros.add(proveedor);

            System.out.println("\n===== VALIDACIÓN CON INSTANCEOF =====");

            for (Registrable registro : registros) {

                if (registro instanceof Cliente) {

                    System.out.println("Es un Cliente.");

                } else if (registro instanceof GuiaTuristico) {

                    System.out.println("Es un Guía Turístico.");

                } else if (registro instanceof Proveedor) {

                    System.out.println("Es un Proveedor.");

                }

            }

            // ===============================
            // Abrir interfaz gráfica
            // ===============================
            SwingUtilities.invokeLater(() -> {
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
            });

        } catch (Exception e) {
            System.out.println("Ocurrió un error:");
            e.printStackTrace();
        }

    }

}