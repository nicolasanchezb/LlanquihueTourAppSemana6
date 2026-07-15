package model;

public class ServicioTuristico {

    private String nombre;
    private double precio;
    private GuiaTuristico guia;

    public ServicioTuristico(String nombre, double precio, GuiaTuristico guia) {
        this.nombre = nombre;
        this.precio = precio;
        this.guia = guia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public GuiaTuristico getGuia() {
        return guia;
    }

    public void setGuia(GuiaTuristico guia) {
        this.guia = guia;
    }

    public String descripcion() {

        return "Servicio: " + nombre +
                "\nPrecio: $" + precio +
                "\nGuía: " + guia.getNombre();

    }

    @Override
    public String toString() {
        return descripcion();
    }

}