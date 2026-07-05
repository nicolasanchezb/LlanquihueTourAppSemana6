package model;

public class RutaGastronomica extends ServicioTuristico {

    private String especialidad;

    public RutaGastronomica(String nombre, double precio, String duracion, String especialidad) {
        super(nombre, precio, duracion);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Ruta Gastronómica ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Duración: " + duracion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println();
    }
}