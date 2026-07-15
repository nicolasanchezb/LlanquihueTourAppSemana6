package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static ArrayList<String> leerArchivo(String ruta) {

        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }

        } catch (IOException e) {

            System.out.println("====================================");
            System.out.println("ERROR AL LEER EL ARCHIVO");
            System.out.println("Ruta utilizada: " + ruta);
            System.out.println("====================================");
            e.printStackTrace();

        }

        return lineas;
    }

}