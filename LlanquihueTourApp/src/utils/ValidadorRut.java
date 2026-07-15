package utils;

public class ValidadorRut {

    public static void validar(String rut) throws RutInvalidoException {

        if (rut == null || rut.trim().isEmpty()) {
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        if (!rut.matches("\\d{7,8}-[\\dkK]")) {
            throw new RutInvalidoException("Formato de RUT inválido.");
        }

    }

}