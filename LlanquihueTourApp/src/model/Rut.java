package model;

import utils.RutInvalidoException;
import utils.ValidadorRut;

public class Rut {

    private String rut;

    public Rut(String rut) throws RutInvalidoException {
        ValidadorRut.validar(rut);
        this.rut = rut;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws RutInvalidoException {
        ValidadorRut.validar(rut);
        this.rut = rut;
    }

    @Override
    public String toString() {
        return rut;
    }

}