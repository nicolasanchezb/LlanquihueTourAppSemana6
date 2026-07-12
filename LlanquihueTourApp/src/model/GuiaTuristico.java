package model;

public class GuiaTuristico implements Registrable {

    private String nombre;
    private String idioma;
    private int experiencia;

    public GuiaTuristico(String nombre, String idioma, int experiencia) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String mostrarResumen() {
        return "Guía: " + nombre +
                "\nIdioma: " + idioma +
                "\nExperiencia: " + experiencia + " años";
    }
}