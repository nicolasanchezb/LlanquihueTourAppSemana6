package model;

public class ColaboradorExterno implements Registrable {

    private String nombre;
    private String empresa;

    public ColaboradorExterno(String nombre, String empresa) {
        this.nombre = nombre;
        this.empresa = empresa;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador: " + nombre +
                "\nEmpresa: " + empresa;
    }
}