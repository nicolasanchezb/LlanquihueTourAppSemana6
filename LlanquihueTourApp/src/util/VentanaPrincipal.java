package ui;

import javax.swing.JOptionPane;
import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;

public class VentanaPrincipal {

    private GestorEntidades gestor;

    public VentanaPrincipal() {
        gestor = new GestorEntidades();
    }

    public void iniciar() {

        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "LLANQUIHUE TOUR\n\n"
                            + "1. Agregar guía\n"
                            + "2. Agregar vehículo\n"
                            + "3. Mostrar registros\n"
                            + "4. Salir"));

            switch (opcion) {

                case 1:

                    String nombre = JOptionPane.showInputDialog("Nombre");

                    String idioma = JOptionPane.showInputDialog("Idioma");

                    int experiencia = Integer.parseInt(
                            JOptionPane.showInputDialog("Años de experiencia"));

                    gestor.agregar(new GuiaTuristico(nombre, idioma, experiencia));

                    break;

                case 2:

                    String patente = JOptionPane.showInputDialog("Patente");

                    String modelo = JOptionPane.showInputDialog("Modelo");

                    int capacidad = Integer.parseInt(
                            JOptionPane.showInputDialog("Capacidad"));

                    gestor.agregar(new Vehiculo(patente, modelo, capacidad));

                    break;

                case 3:

                    JOptionPane.showMessageDialog(null,
                            gestor.mostrarTodo());

                    break;

            }

        } while (opcion != 4);

    }

}