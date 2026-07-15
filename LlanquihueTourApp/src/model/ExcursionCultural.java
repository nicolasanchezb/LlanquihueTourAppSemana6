package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugar;

    public ExcursionCultural(String nombre,
                             double precio,
                             GuiaTuristico guia,
                             String lugar) {

        super(nombre, precio, guia);
        this.lugar = lugar;

    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String descripcion() {

        return super.descripcion() +
                "\nLugar: " + lugar;

    }

}