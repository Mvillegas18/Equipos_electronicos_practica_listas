import java.util.*;

public class Menu {

    public void mostrarMenu() {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Estudiantes de Ingeniería");
            System.out.println("2. Estudiantes de Diseño");
            System.out.println("3. Imprimir inventario total");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Validaciones.leerEntero(scanner);


            switch (opcion) {
                case 1 -> mostrarMenuIngenieria();
                case 2 -> mostrarMenuDiseno();
                case 3 -> {
                    System.out.println("Imprimiendo inventario total...");
                }
                case 4 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);


    }

    public static void mostrarMenuIngenieria(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n-- MENÚ INGENIERÍA --");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            opcion = Validaciones.leerEntero(scanner);

            switch (opcion) {
                case 1:
                    // Lógica de registrar préstamo
                    System.out.println("Registrando préstamo de computador portátil...");
                    break;
                case 2:
                    // Lógica de modificar
                    System.out.println("Modificando computador portátil...");
                    break;
                case 3:
                    // Lógica de devolución
                    System.out.println("Devolviendo computador portátil...");
                    break;
                case 4:
                    // Lógica de búsqueda
                    System.out.println("Buscando computador portátil...");
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no invalida.");
            }
        }while(opcion != 5);
    }
    public static void mostrarMenuDiseno(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n-- MENÚ DISENO --");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            opcion = Validaciones.leerEntero(scanner);

            switch (opcion) {
                case 1:
                    // Lógica de registrar préstamo
                    System.out.println("Registrando préstamo de tableta...");
                    break;
                case 2:
                    // Lógica de modificar
                    System.out.println("Modificando tableta...");
                    break;
                case 3:
                    // Lógica de devolución
                    System.out.println("Devolviendo tableta...");
                    break;
                case 4:
                    // Lógica de búsqueda
                    System.out.println("Buscando tableta...");
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida.");
            }
        }while(opcion != 5);
    }
}
