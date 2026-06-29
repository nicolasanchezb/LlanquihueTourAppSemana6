package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return "Ruta Gastronómica\n" +
                "Nombre: " + nombre +
                "\nDuración: " + duracionHoras + " horas" +
                "\nNúmero de paradas: " + numeroDeParadas;
    }
}