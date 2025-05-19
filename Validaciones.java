import java.util.Scanner;

public class Validaciones {

    public static int leerEntero(Scanner sc) {
        try{
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrado no valida. Ingrese un numero entero.");
            return leerEntero(sc);
        }
    }
}
