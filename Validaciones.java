import java.util.Scanner;

public class Validaciones {

    public static boolean validarTextoSinNumeros(String texto) {
        return texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    public static boolean validarTextoSinEspeciales(String texto) {
        return texto.matches("[a-zA-Z0-9]+");
    }

    public static boolean validarTelefono(String telefono) {
        return telefono.matches("[0-9]{7,10}");
    }

    public static int leerEntero(Scanner sc) {
        try{
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrado no valida. Ingrese un numero entero.");
            return leerEntero(sc);
        }
    }
}
