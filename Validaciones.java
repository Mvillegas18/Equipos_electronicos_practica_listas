import java.util.Scanner;

public class Validaciones {

    public static boolean validarTextoSinNumeros(String texto) {
        return texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    public static boolean validarModalidad(String modalidad) {
        return modalidad.equalsIgnoreCase("virtual") || modalidad.equalsIgnoreCase("presencial");
    }

    public static boolean validarTextoSinEspeciales(String texto) {
        return texto.matches("[a-zA-Z0-9]+");
    }

    public static boolean validarTelefono(String telefono) {
        return telefono.matches("[0-9]{7,10}");
    }

    public boolean validarCedula(String cedula) {
        return cedula.matches("\\d+");
    }

    public static float leerFloat(Scanner sc) {
        try {
            return Float.parseFloat(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Ingrese un número decimal (ej. 3.5):");
            return leerFloat(sc);
        }
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
