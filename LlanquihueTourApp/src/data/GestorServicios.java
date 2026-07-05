package data;

import java.util.ArrayList;
import java.util.List;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica(
                "Sabores del Sur",
                25000,
                "4 horas",
                "Comida típica"));

        servicios.add(new PaseoLacustre(
                "Lago Llanquihue",
                18000,
                "2 horas",
                "Lago Llanquihue"));

        servicios.add(new ExcursionCultural(
                "Museo Colonial",
                12000,
                "3 horas",
                "Frutillar"));

        servicios.add(new RutaGastronomica(
                "Ruta del Salmón",
                28000,
                "5 horas",
                "Mariscos"));

        servicios.add(new PaseoLacustre(
                "Navegación Puerto Varas",
                22000,
                "3 horas",
                "Lago Todos los Santos"));
    }

    public List<ServicioTuristico> getServicios() {
        return servicios;
    }

    public void mostrarServicios() {

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}