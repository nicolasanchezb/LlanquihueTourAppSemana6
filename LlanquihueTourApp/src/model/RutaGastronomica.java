package model;

public class RutaGastronomica extends ServicioTuristico {

    private int restaurantes;

    public RutaGastronomica(String nombre,
                            double precio,
                            GuiaTuristico guia,
                            int restaurantes) {

        super(nombre, precio, guia);
        this.restaurantes = restaurantes;

    }

    public int getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(int restaurantes) {
        this.restaurantes = restaurantes;
    }

    @Override
    public String descripcion() {

        return super.descripcion() +
                "\nRestaurantes: " + restaurantes;

    }

}