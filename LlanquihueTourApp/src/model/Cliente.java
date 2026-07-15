package model;

public class Cliente extends Persona {

    private String correo;

    public Cliente(String nombre, Rut rut, Direccion direccion, String correo) {
        super(nombre, rut, direccion);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public void registrar() {
        System.out.println("Cliente registrado.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCorreo: " + correo;
    }

}