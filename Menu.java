import java.util.*;

public class Menu {

    public void mostrarMenu() {
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
        Metodos_ingenieria metodos = new Metodos_ingenieria();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n-- MENÚ INGENIERÍA --");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            opcion = Validaciones.leerEntero(scanner);

            switch (opcion) {
                case 1:
                    metodos.registrarPrestamoIngenieria();
                    break;
                case 2:
                    metodos.modificarPrestamoIngenieria();
                    break;
                case 3:
                    metodos.devolverEquipoIngenieria();
                    break;
                case 4:
                    metodos.buscarPrestamoIngenieria();
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
        Metodos_Diseño metodos = new Metodos_Diseño();
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
                    metodos.registrarPrestamoDiseno();
                    break;
                case 2:
                    metodos.modificarPrestamoDiseno();
                    break;
                case 3:
                    metodos.devolverPrestamoDiseno();
                    break;
                case 4:
                    metodos.buscarPrestamoDiseno();
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while(opcion != 5);
    }
}