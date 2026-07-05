package model;

public class PaseoLacustre extends ServicioTuristico {

    private String lago;

    public PaseoLacustre(String nombre, double precio, String duracion, String lago) {
        super(nombre, precio, duracion);
        this.lago = lago;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Paseo Lacustre ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Duración: " + duracion);
        System.out.println("Lago: " + lago);
        System.out.println();
    }
}