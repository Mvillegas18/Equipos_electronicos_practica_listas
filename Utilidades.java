public class Utilidades {
    public static boolean validarTextoSinNumeros(String texto) {
        return texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    public static boolean validarTextoSinEspeciales(String texto) {
        return texto.matches("[a-zA-Z0-9]+");
    }

    public static boolean validarTelefono(String telefono) {
        return telefono.matches("[0-9]{7,10}");
    }
}
