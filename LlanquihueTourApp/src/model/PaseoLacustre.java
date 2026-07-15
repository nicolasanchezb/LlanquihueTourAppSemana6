package model;

public class PaseoLacustre extends ServicioTuristico {

    private String lago;

    public PaseoLacustre(String nombre,
                         double precio,
                         GuiaTuristico guia,
                         String lago) {

        super(nombre, precio, guia);
        this.lago = lago;

    }

    public String getLago() {
        return lago;
    }

    public void setLago(String lago) {
        this.lago = lago;
    }

    @Override
    public String descripcion() {

        return super.descripcion() +
                "\nLago: " + lago;

    }

}