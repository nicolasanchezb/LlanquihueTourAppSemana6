package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Ruta Sabores del Sur", 5, 6);

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta Dulce Llanquihue", 4, 5);

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Paseo Lago Llanquihue", 3, "Catamarán");

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Aventura en Kayak", 2, "Kayak");

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Patrimonio Alemán", 6, "Museo Colonial Alemán");

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Historia de Frutillar", 4, "Teatro del Lago");

        System.out.println(ruta1);
        System.out.println("---------------------------");

        System.out.println(ruta2);
        System.out.println("---------------------------");

        System.out.println(paseo1);
        System.out.println("---------------------------");

        System.out.println(paseo2);
        System.out.println("---------------------------");

        System.out.println(excursion1);
        System.out.println("---------------------------");

        System.out.println(excursion2);
    }
}