package data;

import java.util.ArrayList;
import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;

public class GestorEntidades {

    private ArrayList<Registrable> lista;

    public GestorEntidades() {
        lista = new ArrayList<>();
    }

    public void agregar(Registrable r) {
        lista.add(r);
    }

    public String mostrarTodo() {

        String texto = "";

        for (Registrable r : lista) {

            texto += r.mostrarResumen() + "\n------------------\n";

            if (r instanceof GuiaTuristico) {
                texto += "Tipo detectado: Guía Turístico\n";
            }

            if (r instanceof Vehiculo) {
                texto += "Tipo detectado: Vehículo\n";
            }

            texto += "\n";
        }

        return texto;
    }
}