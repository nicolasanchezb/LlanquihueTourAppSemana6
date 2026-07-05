package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugar;

    public ExcursionCultural(String nombre, double precio, String duracion, String lugar) {
        super(nombre, precio, duracion);
        this.lugar = lugar;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Excursión Cultural ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Duración: " + duracion);
        System.out.println("Lugar: " + lugar);
        System.out.println();
    }
}