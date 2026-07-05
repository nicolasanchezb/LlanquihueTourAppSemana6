package model;

public abstract class ServicioTuristico {

    protected String nombre;
    protected double precio;
    protected String duracion;

    public ServicioTuristico(String nombre, double precio, String duracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDuracion() {
        return duracion;
    }

    public abstract void mostrarInformacion();
}