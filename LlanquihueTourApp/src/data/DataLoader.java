package data;

import model.Cliente;
import model.Direccion;
import model.Rut;
import utils.RutInvalidoException;

import java.util.ArrayList;

public class DataLoader {

    public static ArrayList<Cliente> cargarClientes(String ruta) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        ArrayList<String> lineas = FileManager.leerArchivo(ruta);

        for (String linea : lineas) {

            try {

                String[] datos = linea.split(";");

                Cliente cliente = new Cliente(
                        datos[0],
                        new Rut(datos[1]),
                        new Direccion(datos[2], datos[3], datos[4]),
                        datos[5]
                );

                clientes.add(cliente);

            } catch (RutInvalidoException e) {
                System.out.println(e.getMessage());
            }

        }

        return clientes;

    }

}